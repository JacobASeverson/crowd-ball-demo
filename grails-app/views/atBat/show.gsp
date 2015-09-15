
<%@ page import="com.objectpartners.crowdball.atbat.AtBat" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'atBat.label', default: 'AtBat')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-atBat" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-atBat" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list atBat">
			
				<g:if test="${atBatInstance?.pitcher}">
				<li class="fieldcontain">
					<span id="pitcher-label" class="property-label"><g:message code="atBat.pitcher.label" default="Pitcher" /></span>
					
						<span class="property-value" aria-labelledby="pitcher-label"><g:link controller="player" action="show" id="${atBatInstance?.pitcher?.id}">${atBatInstance?.pitcher?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${atBatInstance?.batter}">
				<li class="fieldcontain">
					<span id="batter-label" class="property-label"><g:message code="atBat.batter.label" default="Batter" /></span>
					
						<span class="property-value" aria-labelledby="batter-label"><g:link controller="player" action="show" id="${atBatInstance?.batter?.id}">${atBatInstance?.batter?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${atBatInstance?.pitches}">
				<li class="fieldcontain">
					<span id="pitches-label" class="property-label"><g:message code="atBat.pitches.label" default="Pitches" /></span>
					
						<g:each in="${atBatInstance.pitches}" var="p">
						<span class="property-value" aria-labelledby="pitches-label"><g:link controller="pitch" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${atBatInstance?.result}">
				<li class="fieldcontain">
					<span id="result-label" class="property-label"><g:message code="atBat.result.label" default="Result" /></span>
					
						<span class="property-value" aria-labelledby="result-label"><g:link controller="result" action="show" id="${atBatInstance?.result?.id}">${atBatInstance?.result?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:atBatInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${atBatInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
