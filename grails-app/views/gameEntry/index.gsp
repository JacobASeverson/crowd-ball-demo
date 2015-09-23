
<%@ page import="com.objectpartners.crowdball.game.GameEntry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'gameEntry.label', default: 'GameEntry')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-gameEntry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-gameEntry" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="gameEntry.game.label" default="Game" /></th>
					
						<th><g:message code="gameEntry.user.label" default="User" /></th>
					
						<g:sortableColumn property="complete" title="${message(code: 'gameEntry.complete.label', default: 'Complete')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'gameEntry.dateCreated.label', default: 'Date Created')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${gameEntryInstanceList}" status="i" var="gameEntryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${gameEntryInstance.id}">${fieldValue(bean: gameEntryInstance, field: "game")}</g:link></td>
					
						<td>${fieldValue(bean: gameEntryInstance, field: "user")}</td>
					
						<td><g:formatBoolean boolean="${gameEntryInstance.complete}" /></td>
					
						<td><g:formatDate date="${gameEntryInstance.dateCreated}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${gameEntryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>