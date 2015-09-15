<%@ page import="com.objectpartners.crowdball.team.Team" %>



<div class="fieldcontain ${hasErrors(bean: teamInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="team.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${teamInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: teamInstance, field: 'country', 'error')} required">
	<label for="country">
		<g:message code="team.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="country" required="" value="${teamInstance?.country}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: teamInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="team.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${teamInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: teamInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="team.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${teamInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: teamInstance, field: 'players', 'error')} ">
	<label for="players">
		<g:message code="team.players.label" default="Players" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${teamInstance?.players?}" var="p">
    <li><g:link controller="player" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="player" action="create" params="['team.id': teamInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'player.label', default: 'Player')])}</g:link>
</li>
</ul>


</div>

