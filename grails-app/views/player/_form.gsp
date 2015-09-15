<%@ page import="com.objectpartners.crowdball.player.Player" %>



<div class="fieldcontain ${hasErrors(bean: playerInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="player.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${playerInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: playerInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="player.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${playerInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: playerInstance, field: 'team', 'error')} ">
	<label for="team">
		<g:message code="player.team.label" default="Team" />
		
	</label>
	<g:select id="team" name="team.id" from="${com.objectpartners.crowdball.team.Team.list()}" optionKey="id" value="${playerInstance?.team?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

