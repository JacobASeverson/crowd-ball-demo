<%@ page import="com.objectpartners.crowdball.atbat.AtBat" %>



<div class="fieldcontain ${hasErrors(bean: atBatInstance, field: 'pitcher', 'error')} required">
	<label for="pitcher">
		<g:message code="atBat.pitcher.label" default="Pitcher" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="pitcher" name="pitcher.id" from="${com.objectpartners.crowdball.player.Player.list()}" optionKey="id" required="" value="${atBatInstance?.pitcher?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atBatInstance, field: 'batter', 'error')} required">
	<label for="batter">
		<g:message code="atBat.batter.label" default="Batter" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="batter" name="batter.id" from="${com.objectpartners.crowdball.player.Player.list()}" optionKey="id" required="" value="${atBatInstance?.batter?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atBatInstance, field: 'pitches', 'error')} ">
	<label for="pitches">
		<g:message code="atBat.pitches.label" default="Pitches" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${atBatInstance?.pitches?}" var="p">
    <li><g:link controller="pitch" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="pitch" action="create" params="['atBat.id': atBatInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'pitch.label', default: 'Pitch')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: atBatInstance, field: 'result', 'error')} ">
	<label for="result">
		<g:message code="atBat.result.label" default="Result" />
		
	</label>
	<g:select id="result" name="result.id" from="${com.objectpartners.crowdball.atbat.Result.list()}" optionKey="id" value="${atBatInstance?.result?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

