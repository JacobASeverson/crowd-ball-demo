<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title></title>
</head>

<body>
    <div class="container">
        <sec:ifLoggedIn>
            <div class="jumbotron">
                <h1 class="text-center">Hi <sec:username/> :-) You have recorded <span class="blueEmphasis">${userGames} games</span>.</h1>
                <h3 class="text-center">Stats aren't available yet, but keep recording and they will be!</h3>
            </div>
        </sec:ifLoggedIn>
        <sec:ifNotLoggedIn>
            <div class="jumbotron">
                <h1 class="text-center">Hi :-) There are <span class="blueEmphasis">${recordedGames} games</span> recorded.</h1>
                <h3 class="text-center">Login to enter more and unlock stats!</h3>
            </div>
        </sec:ifNotLoggedIn>
    </div>
</body>
</html>