Generating Some Code
===
The scaffolding was helpful for flushing out the domain model, but now we need to start making changes to both the 
look and the functionality. 

### Generating Controllers and Views
Luckily, Grails ships with a command that will generate the controller code and views that
we were seeing with the scaffolding:   
`./grailsw generate-all com.something.YourDomainClass`   

For our model, you would generate the controller and views for the `Player` domain like:   
`./grailsw generate-all com.objectpartners.crowdball.player.Player`   

> **Note**: Since we already created controllers for scaffolding, you will be asked if you wanted to overwrite it, enter `y`   

> **Second Note**: We could have also used the `./grailsw generate-all "*"` command to save some time since we want to generate for all domains

### Start the Application
Now if you start the app with `./grailsw run-app` you will see the same thing that we saw with the scaffolding, but
`grails-app/controllers/com/objectpartners.crowdball.player.PlayerController.groovy` and 
`grails-app/views/player/*` contain all the code that we can now modify and add to.

# Additional Topics

## Services
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/services.html)
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/2-generate-code/grails-app/services/com/objectpartners/crowdball/game/GameService.groovy)

## Dynamic Finders
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/GORM.html#finders)
* Example: Using with Intellij

## Testing

### Unit Testing Domains
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/testing.html#unitTestingDomains)
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/2-generate-code/test/unit/com/objectpartners/crowdball/game/GameSpec.groovy)

### Unit Testing Controllers
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/testing.html#unitTestingControllers)
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/2-generate-code/test/unit/com/objectpartners/crowdball/game/GameControllerSpec.groovy)

### Unit Testing Services
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/2-generate-code/test/unit/com/objectpartners/crowdball/game/GameServiceSpec.groovy)

### Integration Testing
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/testing.html#integrationTesting)

### Functional Testing
* [Docs] (http://grails.github.io/grails-doc/2.5.1/guide/testing.html#functionalTesting)



