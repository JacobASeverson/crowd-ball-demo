Modeling the Initial Domain
===
The first thing we'll want to do is model our domain and make sure we're able to manipulate and persist data.

## The Domain Model
![CrowdBall Domain](img/crowdballdomain1.png)   

Out initial CrowdBall domain will have 7 different entities that model the at-bats during a game, along with other
things we may want to store.

## Creating the Domain
Grails provides simple a simple command to create domain objects:   
`./grailsw create-domain-class com.something.YourDomainClass`   

For CrowdBall, the first thing I want to create is a "Player" object, which is:   
`./grailsw create-domain-class com.objectpartners.crowdball.player.Player`   

If you run this command, you will notice that Grails creates your domain for you along with a unit test. In this project,
take a look at the rest of the domain objects I created in `grails-app/domain/com/objectpartners/crowdball`.

## Creating Some Scaffolding
Now that we have domain objects that can persist data to a database, we can write tests to make sure our associations
and constraints work as expected. However, we are visual creatures and it can be useful to be able to visually 
interact with domain model to make sure it's what you want. We already saw Grails creates a stock landing page for our
app on creation, but it can also create CRUD scaffolding screens for each domain. To do so we first create a controller
for each domain with the command:   
`./grailsw create-controller com.something.YourDomainClass`   

For the `Player` domain, it would be:   
`./grailsw create-controller com.objectpartners.crowdball.player.Player`   

You will notice this command also creates a unit test for the controller. Once all the controllers are created, to enable
scaffolding you just have to go into each of them and set a static member `scaffold` to `true`. Such as:   
`static scaffold = true`   

Now when you run the application and get to the homepage, click on each of the controller links and you are interacting
with a domain model that is persisting data to an embedded database!

## Bootstrapping Data
Sometimes it's nice to be able to populate the database for lower environments and Grails allows that capability in 
`grails-app/conf/Bootstrap.groovy`. You will notice I created some data in the `development` environment so we have
 some data to play with on application startup.
