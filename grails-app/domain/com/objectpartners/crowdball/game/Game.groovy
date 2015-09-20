package com.objectpartners.crowdball.game

import com.objectpartners.crowdball.team.Team

import java.text.SimpleDateFormat

class Game {

    Team home
    Team away
    Date date

    static hasMany = [innings: Inning]

    static constraints = {
        home nullable: false, blank: false
        away nullable: false, blank: false
        innings nullable: true, blank: true
    }

    @Override
    String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        "${home?.name} vs. ${away} ${dateFormat.format(date)}"
    }
}
