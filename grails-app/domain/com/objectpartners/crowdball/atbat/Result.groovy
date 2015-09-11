package com.objectpartners.crowdball.atbat

class Result {
    
    String type
    String display

    static constraints = {
        type nullable: false, blank: false
        display nullable: false, blank: false
    }

    @Override
    String toString() {
        type
    }
}
