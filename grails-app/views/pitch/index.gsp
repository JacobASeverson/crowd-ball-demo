
<%@ page import="com.objectpartners.crowdball.atbat.Pitch" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pitch.label', default: 'Pitch')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pitch" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pitch" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="type" title="${message(code: 'pitch.type.label', default: 'Type')}" />
					
						<g:sortableColumn property="speed" title="${message(code: 'pitch.speed.label', default: 'Speed')}" />
					
						<g:sortableColumn property="pitchResult" title="${message(code: 'pitch.pitchResult.label', default: 'Pitch Result')}" />
					
						<th><g:message code="pitch.atBat.label" default="At Bat" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${pitchInstanceList}" status="i" var="pitchInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${pitchInstance.id}">${fieldValue(bean: pitchInstance, field: "type")}</g:link></td>
					
						<td>${fieldValue(bean: pitchInstance, field: "speed")}</td>
					
						<td>${fieldValue(bean: pitchInstance, field: "pitchResult")}</td>
					
						<td>${fieldValue(bean: pitchInstance, field: "atBat")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${pitchInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
