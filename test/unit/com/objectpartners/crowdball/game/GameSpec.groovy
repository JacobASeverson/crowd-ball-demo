package com.objectpartners.crowdball.game

import com.objectpartners.crowdball.team.Team
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@Mock(Team)
@TestFor(Game)
class GameSpec extends Specification {

    void "can save a valid Game instance"() {
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
        Game result = game.save(flush: true)

        then:
        !result.hasErrors()
        Game.get(result.id)
    }

    void 'Trying to save an invalid instance fails validation'() {
        when:
        Game result = new Game()
        result.save(flush: true)

        then:
        result.hasErrors()
        result.errors.errorCount == 3
    }
}
