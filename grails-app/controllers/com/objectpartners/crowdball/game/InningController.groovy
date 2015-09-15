package com.objectpartners.crowdball.game



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InningController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Inning.list(params), model:[inningInstanceCount: Inning.count()]
    }

    def show(Inning inningInstance) {
        respond inningInstance
    }

    def create() {
        respond new Inning(params)
    }

    @Transactional
    def save(Inning inningInstance) {
        if (inningInstance == null) {
            notFound()
            return
        }

        if (inningInstance.hasErrors()) {
            respond inningInstance.errors, view:'create'
            return
        }

        inningInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'inning.label', default: 'Inning'), inningInstance.id])
                redirect inningInstance
            }
            '*' { respond inningInstance, [status: CREATED] }
        }
    }

    def edit(Inning inningInstance) {
        respond inningInstance
    }

    @Transactional
    def update(Inning inningInstance) {
        if (inningInstance == null) {
            notFound()
            return
        }

        if (inningInstance.hasErrors()) {
            respond inningInstance.errors, view:'edit'
            return
        }

        inningInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Inning.label', default: 'Inning'), inningInstance.id])
                redirect inningInstance
            }
            '*'{ respond inningInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Inning inningInstance) {

        if (inningInstance == null) {
            notFound()
            return
        }

        inningInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Inning.label', default: 'Inning'), inningInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'inning.label', default: 'Inning'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
