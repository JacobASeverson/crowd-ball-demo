Updating the Domain
===
We now have a functioning domain model and users/security in place, but we need to change out domain so users can be
associated to their individual game entries so we can keep track of them. 

![Domain update](img/crowdballdomain2.png)

`./grailsw create-domain-class com.objectpartners.crowdball.game.GameEntry`
`./grailsw generate-all com.objectpartners.crowdball.game.GameEntry`

I also added an inning of real game data to `Bootstrap.groovy` from the Twins vs. Cubs game on June 6, 2015 
(Gibson v. Arrieta).




