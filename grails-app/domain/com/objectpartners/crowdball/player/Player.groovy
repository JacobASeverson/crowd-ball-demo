package com.objectpartners.crowdball.player

import com.objectpartners.crowdball.team.Team

class Player {

    String firstName
    String lastName
    Team team

    static constraints = {
        firstName nullable: false, blank: false
        lastName nullable: false, blank: false
        team nullable: true, blank: true
    }

    @Override
    String toString() {
        "$lastName, $firstName"
    }
}
