package com.objectpartners.crowdball.game

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured('ROLE_USER')
@Transactional(readOnly = true)
class GameEntryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond GameEntry.list(params), model:[gameEntryInstanceCount: GameEntry.count()]
    }

    def show(GameEntry gameEntryInstance) {
        respond gameEntryInstance
    }

    def create() {
        respond new GameEntry(params)
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
