package com.objectpartners.crowdball.atbat



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PitchController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Pitch.list(params), model:[pitchInstanceCount: Pitch.count()]
    }

    def show(Pitch pitchInstance) {
        respond pitchInstance
    }

    def create() {
        respond new Pitch(params)
    }

    @Transactional
    def save(Pitch pitchInstance) {
        if (pitchInstance == null) {
            notFound()
            return
        }

        if (pitchInstance.hasErrors()) {
            respond pitchInstance.errors, view:'create'
            return
        }

        pitchInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pitch.label', default: 'Pitch'), pitchInstance.id])
                redirect pitchInstance
            }
            '*' { respond pitchInstance, [status: CREATED] }
        }
    }

    def edit(Pitch pitchInstance) {
        respond pitchInstance
    }

    @Transactional
    def update(Pitch pitchInstance) {
        if (pitchInstance == null) {
            notFound()
            return
        }

        if (pitchInstance.hasErrors()) {
            respond pitchInstance.errors, view:'edit'
            return
        }

        pitchInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Pitch.label', default: 'Pitch'), pitchInstance.id])
                redirect pitchInstance
            }
            '*'{ respond pitchInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Pitch pitchInstance) {

        if (pitchInstance == null) {
            notFound()
            return
        }

        pitchInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Pitch.label', default: 'Pitch'), pitchInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pitch.label', default: 'Pitch'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
