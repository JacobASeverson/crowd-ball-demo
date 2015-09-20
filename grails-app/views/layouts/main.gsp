<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>CrowdBall</title>
  		<asset:stylesheet src="application.css"/>
		<g:layoutHead/>
	</head>
	<body>
        <g:set var="username" value="${sec.username().capitalize()}"/>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <g:link class="navbar-brand" controller="home">CrowdBall</g:link>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <sec:ifNotLoggedIn>
                            <li><g:link controller="login" action="auth">Login</g:link></li>
                        </sec:ifNotLoggedIn>
                        <sec:ifLoggedIn>
                            <li><g:link controller="game">Enter Game</g:link></li>
                            <li><g:link controller="gameEntry">${username}</g:link></li>
                            <li><g:link controller="logout">Logout</g:link></li>
                        </sec:ifLoggedIn>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <div class="row mainContent">
            <div class="mainContent col-md-2"></div>
            <div class="col-md-8"><g:layoutBody/></div>
            <div class="col-md-2"></div>
        </div>
        <asset:javascript src="application.js"/>
	</body>
</html>
