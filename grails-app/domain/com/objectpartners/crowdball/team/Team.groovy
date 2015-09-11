package com.objectpartners.crowdball.team

import com.objectpartners.crowdball.player.Player

class Team {

    String name
    String country
    String city
    String state

    static hasMany = [players: Player]

    static constraints = {
        name nullable: false, blank: false
        country nullable: false, blank: false
        city nullable: false, blank: false
        state nullable: false, blank: false
    }

    @Override
    String toString() {
        name
    }
}
