<%@ page import="com.objectpartners.crowdball.atbat.Pitch" %>



<div class="fieldcontain ${hasErrors(bean: pitchInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="pitch.type.label" default="Type" />
		
	</label>
	<g:textField name="type" value="${pitchInstance?.type}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pitchInstance, field: 'speed', 'error')} ">
	<label for="speed">
		<g:message code="pitch.speed.label" default="Speed" />
		
	</label>
	<g:field name="speed" value="${fieldValue(bean: pitchInstance, field: 'speed')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pitchInstance, field: 'pitchResult', 'error')} ">
	<label for="pitchResult">
		<g:message code="pitch.pitchResult.label" default="Pitch Result" />
		
	</label>
	<g:textField name="pitchResult" value="${pitchInstance?.pitchResult}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pitchInstance, field: 'atBat', 'error')} required">
	<label for="atBat">
		<g:message code="pitch.atBat.label" default="At Bat" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="atBat" name="atBat.id" from="${com.objectpartners.crowdball.atbat.AtBat.list()}" optionKey="id" required="" value="${pitchInstance?.atBat?.id}" class="many-to-one"/>

</div>

