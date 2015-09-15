
<%@ page import="com.objectpartners.crowdball.atbat.Pitch" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pitch.label', default: 'Pitch')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-pitch" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-pitch" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list pitch">
			
				<g:if test="${pitchInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="pitch.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${pitchInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pitchInstance?.speed}">
				<li class="fieldcontain">
					<span id="speed-label" class="property-label"><g:message code="pitch.speed.label" default="Speed" /></span>
					
						<span class="property-value" aria-labelledby="speed-label"><g:fieldValue bean="${pitchInstance}" field="speed"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pitchInstance?.pitchResult}">
				<li class="fieldcontain">
					<span id="pitchResult-label" class="property-label"><g:message code="pitch.pitchResult.label" default="Pitch Result" /></span>
					
						<span class="property-value" aria-labelledby="pitchResult-label"><g:fieldValue bean="${pitchInstance}" field="pitchResult"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pitchInstance?.atBat}">
				<li class="fieldcontain">
					<span id="atBat-label" class="property-label"><g:message code="pitch.atBat.label" default="At Bat" /></span>
					
						<span class="property-value" aria-labelledby="atBat-label"><g:link controller="atBat" action="show" id="${pitchInstance?.atBat?.id}">${pitchInstance?.atBat?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:pitchInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${pitchInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
