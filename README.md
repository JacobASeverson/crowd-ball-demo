Updating the Domain
===
We now have a functioning domain model and users/security in place, but we need to change out domain so users can be
associated to their individual game entries so we can keep track of them. 

![Domain update](img/crowdballdomain2.png)

We will create a `GameEntry` domain that will associate a `User` to an instance of `Game` so we can keep track of who
enterred what:   

### Create the Domain
`./grailsw create-domain-class com.objectpartners.crowdball.game.GameEntry`   

### Generate Controller and Views
`./grailsw generate-all com.objectpartners.crowdball.game.GameEntry`   

### Add Dev Data
I also added an inning of real game data to `Bootstrap.groovy` from the Twins vs. Cubs game on June 6, 2015 
(Gibson v. Arrieta).

# Additional Topics
None for this branch :-)




