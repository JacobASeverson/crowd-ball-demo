<%@ page import="com.objectpartners.crowdball.game.Inning" %>



<div class="fieldcontain ${hasErrors(bean: inningInstance, field: 'number', 'error')} required">
	<label for="number">
		<g:message code="inning.number.label" default="Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="number" type="number" value="${inningInstance.number}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inningInstance, field: 'atBats', 'error')} ">
	<label for="atBats">
		<g:message code="inning.atBats.label" default="At Bats" />
		
	</label>
	<g:select name="atBats" from="${com.objectpartners.crowdball.atbat.AtBat.list()}" multiple="multiple" optionKey="id" size="5" value="${inningInstance?.atBats*.id}" class="many-to-many"/>

</div>

