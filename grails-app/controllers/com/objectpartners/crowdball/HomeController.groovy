package com.objectpartners.crowdball

import com.objectpartners.crowdball.game.GameEntry
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class HomeController {

    SpringSecurityService springSecurityService

    def index() {
        Integer numUserGames = null
        if (springSecurityService.loggedIn) {
            numUserGames = GameEntry.findByUser(springSecurityService.currentUser).count()
        }
        render view: 'index', model: [recordedGames: GameEntry.count(), userGames: numUserGames]
    }
}
