# hello-rest

A jersey rest project which  exposes a rest get to say return hello.

this project has two branches.
```
main branch: does not set the X-Frame-Options field in the response header
Secure branch: sets the X-Frame-Options field by adding a new servlet filter and referencing it in the WEB-INF/web.xml
```

# references:
This application is was based on the application described in this link:
https://www.javatpoint.com/jax-rs-example-jersey

References this sample for adding a servlet filter via the web.xml
https://digitalocean.com/community/tutorials/java-servlet-filter-example-tutorial

Adds a working examples to add a response header 
https://stackoverflow.com/questions/11025605/response-is-committing-and-dofilter-chain-is-broken