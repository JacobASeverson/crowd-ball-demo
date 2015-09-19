package com.objectpartners.crowdball.game

import com.objectpartners.crowdball.user.User

class GameEntry {

    Date dateCreated
    Game game
    User user
    Boolean complete = false


    static constraints = {
        game nullable: false, blank: false
        user nullable: false, blank: false
    }
}
