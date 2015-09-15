<%@ page import="com.objectpartners.crowdball.game.Game" %>



<div class="fieldcontain ${hasErrors(bean: gameInstance, field: 'home', 'error')} required">
	<label for="home">
		<g:message code="game.home.label" default="Home" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="home" name="home.id" from="${com.objectpartners.crowdball.team.Team.list()}" optionKey="id" required="" value="${gameInstance?.home?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: gameInstance, field: 'away', 'error')} required">
	<label for="away">
		<g:message code="game.away.label" default="Away" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="away" name="away.id" from="${com.objectpartners.crowdball.team.Team.list()}" optionKey="id" required="" value="${gameInstance?.away?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: gameInstance, field: 'innings', 'error')} ">
	<label for="innings">
		<g:message code="game.innings.label" default="Innings" />
		
	</label>
	<g:select name="innings" from="${com.objectpartners.crowdball.game.Inning.list()}" multiple="multiple" optionKey="id" size="5" value="${gameInstance?.innings*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: gameInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="game.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="day"  value="${gameInstance?.date}"  />

</div>

