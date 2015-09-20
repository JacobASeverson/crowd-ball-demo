<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
		<div id="create-gameEntry" class="content scaffold-create" role="main">
			<h1>New Game Entry</h1>
			<g:form url="[resource:gameEntry, action:'save']" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="save" value="Submit" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
