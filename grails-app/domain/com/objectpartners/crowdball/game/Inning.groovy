package com.objectpartners.crowdball.game

import com.objectpartners.crowdball.atbat.AtBat

class Inning {

    Integer number

    static hasMany = [atBats: AtBat]

    static constraints = {
        number nullable: false, blank: false
        atBats nullable: true, blank: true
    }

    @Override
    String toString() {
        "Inning $id"
    }
}
