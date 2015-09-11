package com.objectpartners.crowdball.atbat

class Pitch {

    String type
    Double speed
    String pitchResult

    static belongsTo = [atBat: AtBat]

    static constraints = {
        type nullable: true, blank: true
        speed nullable: true, blank: true
        pitchResult nullable: true, blank: true
    }

    @Override
    String toString() {
        "Pitch $id"
    }
}
