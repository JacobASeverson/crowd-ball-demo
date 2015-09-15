<%@ page import="com.objectpartners.crowdball.atbat.Result" %>



<div class="fieldcontain ${hasErrors(bean: resultInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="result.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="type" required="" value="${resultInstance?.type}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: resultInstance, field: 'display', 'error')} required">
	<label for="display">
		<g:message code="result.display.label" default="Display" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="display" required="" value="${resultInstance?.display}"/>

</div>

