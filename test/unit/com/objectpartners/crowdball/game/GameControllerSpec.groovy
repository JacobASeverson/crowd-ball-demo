package com.objectpartners.crowdball.game

import com.objectpartners.crowdball.team.Team
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@Mock([Game, Team])
@TestFor(GameController)
class GameControllerSpec extends Specification {

    GameService gameServiceMock

    void setup() {
        gameServiceMock = Mock(GameService)
        controller.gameService = gameServiceMock
    }

    void "Make a request to save a valid Game instance"() {
        given:
        Team home = new Team (
                name: 'testHomeTeam',
                country: 'USA',
                city: 'Minneapolis',
                state: 'MN',
                players: []
        )
        Team away = new Team (
                name: 'testAwayTeam',
                country: 'USA',
                city: 'Minneapolis',
                state: 'MN',
                players: []
        )
        Game game = new Game (
                home: home,
                away: away,
                date: new Date()
        )
        request.method = 'POST'

        when:
        controller.save(game)

        then:
        1 * gameServiceMock.save(_ as Game) >> { Game gameToSave ->
            gameToSave.save(flush: true)
        }
        response.status == 201
    }
}
