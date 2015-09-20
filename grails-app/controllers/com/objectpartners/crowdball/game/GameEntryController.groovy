package com.objectpartners.crowdball.game

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import static org.springframework.http.HttpStatus.*

@Secured('ROLE_USER')
@Transactional(readOnly = true)
class GameEntryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    SpringSecurityService springSecurityService

    def index(Integer max) {

        params.max = Math.min(max ?: 10, 100)
        respond GameEntry.findByUser(springSecurityService.currentUser).list(params),
                model:[gameEntryInstanceCount: GameEntry.count()]
    }

    def show(GameEntry gameEntryInstance) {
        if (gameEntryInstance.user != springSecurityService.currentUser) {
            notFound()
        }
        render view: 'show', model: [gameEntryInstance: gameEntryInstance,
                                     innings: gameEntryInstance?.game?.innings?.sort {it.number}]
    }

    def create() {
        Game game = new Game()
        GameEntry gameEntry = new GameEntry(game: game)
        render view: 'create', model: [gameEntry: gameEntry]
    }

    @Transactional
    def save(GameEntry gameEntryInstance) {
        if (gameEntryInstance == null) {
            notFound()
            return
        }

        if (gameEntryInstance.hasErrors()) {
            respond gameEntryInstance.errors, view:'create'
            return
        }

        gameEntryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'gameEntry.label', default: 'GameEntry'), gameEntryInstance.id])
                redirect gameEntryInstance
            }
            '*' { respond gameEntryInstance, [status: CREATED] }
        }
    }

    def edit(GameEntry gameEntryInstance) {
        respond gameEntryInstance
    }

    @Transactional
    def update(GameEntry gameEntryInstance) {
        if (gameEntryInstance == null) {
            notFound()
            return
        }

        if (gameEntryInstance.hasErrors()) {
            respond gameEntryInstance.errors, view:'edit'
            return
        }

        gameEntryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'GameEntry.label', default: 'GameEntry'), gameEntryInstance.id])
                redirect gameEntryInstance
            }
            '*'{ respond gameEntryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(GameEntry gameEntryInstance) {

        if (gameEntryInstance == null) {
            notFound()
            return
        }

        gameEntryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'GameEntry.label', default: 'GameEntry'), gameEntryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'gameEntry.label', default: 'GameEntry'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
