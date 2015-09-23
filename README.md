Session Handling
===
Now that the application is pretty and functional it's starting to get popular. We need to launch multiple
instances and balance load across them so the app doesn't keep failing. In order to avoid users getting routed to
servers that aren't aware of their session, we'll store session information in an external data store (in this case
we'll just use our database, but in practice we would opt for a high-performance cache).

### Adding the data-session Plugin
`compile ":database-session:1.2.1"` to `BuildConfig.groovy`

There are many configuration options with this plugin as well, but the only one we'll need to get started is one that enables
the plugin in dev. Add `grails.plugin.databasesession.enabled = true` to `Config.groovy`.

# Additional Topics
None for this branch :-)


