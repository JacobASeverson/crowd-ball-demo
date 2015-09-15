
<%@ page import="com.objectpartners.crowdball.atbat.AtBat" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'atBat.label', default: 'AtBat')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-atBat" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-atBat" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="atBat.pitcher.label" default="Pitcher" /></th>
					
						<th><g:message code="atBat.batter.label" default="Batter" /></th>
					
						<th><g:message code="atBat.result.label" default="Result" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${atBatInstanceList}" status="i" var="atBatInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${atBatInstance.id}">${fieldValue(bean: atBatInstance, field: "pitcher")}</g:link></td>
					
						<td>${fieldValue(bean: atBatInstance, field: "batter")}</td>
					
						<td>${fieldValue(bean: atBatInstance, field: "result")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${atBatInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
