Add Users and Security
===
`./grailsw s2-quickstart com.objectpartners.crowdball.user User Role`

In `grails-app/domain`
```
com.objectpartners.crowdball.user.User
com.objectpartners.crowdball.user.Role
com.objectpartners.crowdball.user.UserRole
```

In `grails-app/conf/Config.groovy` check out the configurations added to the bottom by the plugin.

In `grails-app/conf/BootStrap.groovy` added an example `User`, `Role`, and a `UserRole`

`@Secured('ROLE_USER')` At top of every controller

# Additional Topics

## Plugins

### Using Plugins
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/plugins.html)
* [Example](https://github.com/JacobASeverson/crowd-ball-demo/blob/3-security-user/grails-app/conf/BuildConfig.groovy#L56-L78)

### Inline Plugins
* [Docs](http://grails.github.io/grails-doc/2.5.1/guide/plugins.html)
