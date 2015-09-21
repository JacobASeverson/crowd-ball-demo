package com.objectpartners.crowdball.game

import grails.transaction.Transactional

@Transactional
class GameService {

    Game save(Game game) {
        game.save()
    }
}
