Generating Some Code
===
The scaffolding was helpful for flushing out the domain model, but now we need to start making changes to both the 
look and the functionality. Luckily, Grails ships with a command that will generate the controller code and views that
we were seeing with the scaffolding:   
`./grailsw generate-all com.something.YourDomainClass`   

For our model, you would generate the controller and views for the `Player` domain like:   
`./grailsw generate-all com.objectpartners.crowdball.player.Player`   

> **Note**: Since we already created controllers for scaffolding, you will be asked if you wanted to overwrite it, enter `y`   

> **Second Note**: We could have also used the `./grailsw generate-all "*"` command to save some time since we want to generate for all domains

Now if you start the app with `./grailsw run-app` you will see the same thing that we saw with the scaffolding, but
`grails-app/controllers/com/objectpartners.crowdball.player.PlayerController.groovy` and 
`grails-app/views/player/*` contain all the code that we can now modify and add to.

