package com.objectpartners.crowdball.atbat

import com.objectpartners.crowdball.player.Player

class AtBat {

    Player pitcher
    Player batter
    Result result

    static hasMany = [pitches: Pitch]

    static constraints = {
        pitcher nullable: false, blank: false
        batter nullable: false, blank: false
        pitches nullable: true, blank: true
        result nullable: true, blank: true
    }

    @Override
    String toString() {
        "At bat $id"
    }
}
