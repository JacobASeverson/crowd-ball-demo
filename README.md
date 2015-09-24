Add Users and Security
===
Now that we have code generated for each layer of our working model we start to think about security and how we
model a user accessing the system. Luckily Grails has a very nice plugin that allows us to add Spring Security and
accomplish both tasks very quickly.

### Adding the Grails Spring Security Core Plugin
First we need to add the plugin to our project:   
`compile ":spring-security-core:2.0-RC5"`   

### Generate the Security Domain
The plugin provides a script to generate `User`, `Role`, and `UserRole` domains to model our users and their permissions:   
`./grailsw s2-quickstart com.objectpartners.crowdball.user User Role`

You will notice this script generates our domain classes for us in `grails-app/domain`:   
```
com.objectpartners.crowdball.user.User
com.objectpartners.crowdball.user.Role
com.objectpartners.crowdball.user.UserRole
```

### Review Security Config
The plugin also adds some configuration options to `grails-app/conf/Config.groovy`. Note that these are not the only 
configurable parts of the plugin. There are many hooks and configurable pieces to customize your Spring Security implementation
through the plugin.

### Add Dev Security Data
I added example `User`, `Role`, and a `UserRole` instances to `Bootstrap.groovy` so we have a user and permissions in
the development environment to test it out.

### Secure Functionality
Now all we have to do is secure some functionality so only users with the "ROLE_USER" role (that I created in `Bootstrap.groovy`)
can access it. We do this by adding `@Secured('ROLE_USER')` to the top of every controller.

# Additional Topics

## Plugins

### Using Plugins
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/plugins.html)
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/3-security-user/grails-app/conf/BuildConfig.groovy#L56-L78)

### Inline Plugins
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/plugins.html)
