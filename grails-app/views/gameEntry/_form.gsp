<%@ page import="com.objectpartners.crowdball.game.GameEntry" %>



<div class="fieldcontain ${hasErrors(bean: gameEntryInstance, field: 'game', 'error')} required">
	<label for="game">
		<g:message code="gameEntry.game.label" default="Game" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="game" name="game.id" from="${com.objectpartners.crowdball.game.Game.list()}" optionKey="id" required="" value="${gameEntryInstance?.game?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: gameEntryInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="gameEntry.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${com.objectpartners.crowdball.user.User.list()}" optionKey="id" required="" value="${gameEntryInstance?.user?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: gameEntryInstance, field: 'complete', 'error')} ">
	<label for="complete">
		<g:message code="gameEntry.complete.label" default="Complete" />
		
	</label>
	<g:checkBox name="complete" value="${gameEntryInstance?.complete}" />

</div>

