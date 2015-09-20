
<%@ page import="com.objectpartners.crowdball.game.GameEntry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
	</head>
	<body>
        <g:set var="gameInst" value="${gameEntryInstance.game}" />
		<div id="show-gameEntry" class="content scaffold-show" role="main">
			<h1>
                Your Entry: ${gameEntryInstance?.game?.toString()}
            </h1>
        <table>
            <tr>
                <td><b>Home:</b></td>
                <td>${gameInst.home}</td>
            </tr>
            <tr>
                <td><b>Away:</b></td>
                <td>${gameInst.away}</td>
            </tr>
            <tr>
                <td><b>Date:</b></td>
                <td>${gameInst.date}</td>
            </tr>
        </table>
            <table class="table table-bordered table-striped">
                <g:each in="${innings}" var="inning">
                    <g:if test="${inning.atBats.size() > 0}">
                        <tr>
                            <th>Inning ${inning.number}</th>
                        </tr>
                        <tr>
                            <td>
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th class="cellPadEmpty"></th>
                                        <th>Pitcher</th>
                                        <th>Batter</th>
                                        <th>AB Result</th>
                                        <th>Type</th>
                                        <th>Speed</th>
                                        <th>Pitch Result</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <g:each in="${inning.atBats}" var="atBat">
                                        <tr>
                                            <td class="cellPadEmpty"></td>
                                            <td>${atBat.pitcher.firstName} ${atBat.pitcher.lastName}</td>
                                            <td>${atBat.batter.firstName} ${atBat.batter.lastName}</td>
                                            <td>${atBat.result.display}</td>
                                        </tr>
                                        <g:each in="${atBat.pitches}" var="pitch">
                                            <tr>
                                                <td class="cellPadEmpty"></td>
                                                <td></td>
                                                <td></td>
                                                <td></td>
                                                <td>${pitch.type}</td>
                                                <td>${pitch.speed}</td>
                                                <td>${pitch.pitchResult}</td>
                                            </tr>
                                        </g:each>
                                    </g:each>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                    </g:if>
                </g:each>
            </table>
            <g:if test="${!gameEntryInstance.complete}">
                <g:form url="[resource:gameEntryInstance, action:'edit']" method="POST">
                    <fieldset class="buttons">
                        <g:link class="btn btn-default" action="edit" resource="${gameEntryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                    </fieldset>
                </g:form>
            </g:if>
		</div>
	</body>
</html>
