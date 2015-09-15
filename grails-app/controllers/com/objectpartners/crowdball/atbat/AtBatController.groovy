package com.objectpartners.crowdball.atbat



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AtBatController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AtBat.list(params), model:[atBatInstanceCount: AtBat.count()]
    }

    def show(AtBat atBatInstance) {
        respond atBatInstance
    }

    def create() {
        respond new AtBat(params)
    }

    @Transactional
    def save(AtBat atBatInstance) {
        if (atBatInstance == null) {
            notFound()
            return
        }

        if (atBatInstance.hasErrors()) {
            respond atBatInstance.errors, view:'create'
            return
        }

        atBatInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'atBat.label', default: 'AtBat'), atBatInstance.id])
                redirect atBatInstance
            }
            '*' { respond atBatInstance, [status: CREATED] }
        }
    }

    def edit(AtBat atBatInstance) {
        respond atBatInstance
    }

    @Transactional
    def update(AtBat atBatInstance) {
        if (atBatInstance == null) {
            notFound()
            return
        }

        if (atBatInstance.hasErrors()) {
            respond atBatInstance.errors, view:'edit'
            return
        }

        atBatInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AtBat.label', default: 'AtBat'), atBatInstance.id])
                redirect atBatInstance
            }
            '*'{ respond atBatInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AtBat atBatInstance) {

        if (atBatInstance == null) {
            notFound()
            return
        }

        atBatInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AtBat.label', default: 'AtBat'), atBatInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'atBat.label', default: 'AtBat'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
