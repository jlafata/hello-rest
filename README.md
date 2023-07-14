# hello-rest

    A jersey rest project which  exposes a RESTFUL get to return a greeting

this project has two branches.
```
main branch: does not set the X-Frame-Options field in the response header
Secure branch: sets the X-Frame-Options field by adding a new servlet filter and referencing it in the WEB-INF/web.xml
```

# deployment instructions - main branch
```
git checkout main
gradle build
cf push
open app in browser, header does not include X-Frame-Options (see following image)
```
![no-x-frame-options](images/http-header-without-x-frame-options.png)

# deployment instructions - Secure branch
```
git checkout Secure
gradle build
cf push
open app in browser, header DOES include X-Frame-Options (see following image)
```
![no-x-frame-options](images/http-header-with-x-frame-options.png)


# references:
This application is based on the application described in this link:
https://www.javatpoint.com/jax-rs-example-jersey

This application References this sample for adding a servlet filter via the web.xml
https://digitalocean.com/community/tutorials/java-servlet-filter-example-tutorial

This application references this link to deliver a working example of X-Frame-Options in the response header 
https://stackoverflow.com/questions/11025605/response-is-committing-and-dofilter-chain-is-broken

