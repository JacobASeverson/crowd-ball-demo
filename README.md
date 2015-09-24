Creating the UI
===
We now have a working model with security, but we need to make the UI functional for our users. Since we want to get
this to beta as soon as possible we'll roll with Bootstrap and make it pretty later. 

### Adding the Bootstrap Plugin
There is a very nice Bootstrap plugin for Grails that we'll want to hook into the "asset-pipeline" which we can do by 
first adding the plugin:      
`runtime ':twitter-bootstrap:3.3.5'` to `BuildConfig.groovy`   

### Including Bootstrap Assets to asset-pipeline
Now we add the bootstrap css and javascript assets to asset-pipeline:   
Add `//= require bootstrap` to `grails-app/assets/javascripts/application.js`
Add `= require bootstrap` to the top comment section in `grails-app/assets/javascripts/application.css`

### Adding a Home Page
Instead of the stock landing page I'll add a "home" controller and associated view to welcome visitors and also greet
authenticated users, they are located:   
`grails-app/controllers/com/objectpartners/crowdball/HomeController.groovy`   
`grails-app/views/home/index.gsp`

### Overriding the Login Page
I also wanted to redesign the "login" page, which I did by creating a new view at `grails-app/views/login/auth`. Since
the artefacts in the project are evaluated AFTER the plugins, creating this view will override the one supplied by the
plugin which has the same name.

# Additional Topics
## Views
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/theWebLayer.html#gsp)
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/5-creating-ui/grails-app/views/home/index.gsp)

## Layouts
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/theWebLayer.html#layouts)
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/5-creating-ui/grails-app/views/layouts/main.gsp)

## Taglibs
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/theWebLayer.html#tags)
* [Example](https://github.com/grails-plugins/grails-spring-security-core/blob/master/grails-app/taglib/grails/plugin/springsecurity/SecurityTagLib.groovy#L134-L138)
