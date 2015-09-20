
<g:set var="game" value="${new com.objectpartners.crowdball.game.Game()}" />
<div>
    <label for="home">Home:</label>
    <g:select name="home" from="${com.objectpartners.crowdball.team.Team.list()}" class="form-control" />
</div>
<div>
    <label for="away">Away:</label>
    <g:select name="away" from="${com.objectpartners.crowdball.team.Team.list()}" class="form-control" />
</div>
<div>
    <label for="gameDate">Date:</label>
    <g:datePicker name="gameDate" precision="day" />
</div>
<g:each in="${1..9}" var="inningNum" >
    <div>
        <label for="inning${inningNum}">Inning ${inningNum}</label>
        <f:with bean="inning">
            <f:field property="number" />
        </f:with>
    </div>
</g:each>

