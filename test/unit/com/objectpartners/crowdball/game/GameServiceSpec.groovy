package com.objectpartners.crowdball.game

import com.objectpartners.crowdball.team.Team
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(GameService)
@Mock([Team, Game])
class GameServiceSpec extends Specification {

    void "save a valid Game instance"() {
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

        when:
        service.save(game)

        then:
        Game.get(game.id)
    }
}
