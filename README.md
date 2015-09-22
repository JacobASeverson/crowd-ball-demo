Grails: build fast, scale faster
===
This repository serves as a demonstration of building a Grails application from the ground up. Although most of the
discussion will occur during the accompanying presentation, I'm aiming to make this repository into a tutorial-style walk through
of building the resulting application. Each progression is contained on numbered branches that specify the order in 
which they were built.

## The CrowdBall Application
The CrowdBall application allows baseball folk to input stats for their favorite teams whenever they have time, and as
a reward are provided access to complex statistical analysis for the next day (or days) of matchups. This is the perfect
tool for daily fantasy baseball players or baseball stat nerds.

## Getting Started
It is assumed that you have Grails already installed, if not, check out [SDKMAN!](http://sdkman.io/) which is the best way in my opinion. The
version of Grails used in this application is `2.5.1`, so make sure that is the version on your path while going through
the steps below.

1. Create the application `grails create-app crowd-ball-demo`
2. Change into the newly created `crowd-ball-demo` directory and run the application `./grailsw run-app`
3. Navigate to *http://localhost:8080/crowd-ball-demo*   

You should see a stock welcome page generated by Grails with some helpful metadata. We are ready to start building the
initial domain model.

# Additional Topics
This section will be created for each branch in the repository that will contain a list and links to the topics discussed during the live presentation. Partially for anyone going back and reviewing the code, but mostly so I don't forget to talk about anything.

## The Grails CLI Interactive Mode
* [Using interactive mode](http://grails.github.io/grails-doc/2.5.1/guide/gettingStarted.html#usingInteractiveMode)

## Convention over Configuration
* [Directory structure](http://grails.github.io/grails-doc/2.5.1/guide/gettingStarted.html#conventionOverConfiguration)
* [Example configuration](https://github.com/JacobASeverson/crowd-ball-demo/blob/master/grails-app/conf/Config.groovy)
* [Datasource configuration](https://github.com/JacobASeverson/crowd-ball-demo/blob/master/grails-app/conf/DataSource.groovy)

## Easier Configuration
* [Environment-based configuration](https://github.com/JacobASeverson/crowd-ball-demo/blob/master/grails-app/conf/Config.groovy#L88-L96)
* [External configuration](https://github.com/JacobASeverson/crowd-ball-demo/blob/master/grails-app/conf/Config.groovy#L5-L8)
