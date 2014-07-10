

# embedded jetty rest

sample implementation based on <br />
- [http://news-anand.blogspot.com/2012/05/today-i-am-going-tell-you-how-to-create.html](http://news-anand.blogspot.com/2012/05/today-i-am-going-tell-you-how-to-create.html)
- [http://examples.javacodegeeks.com/enterprise-java/rest/resteasy/json-example-with-resteasy-jackson/](http://examples.javacodegeeks.com/enterprise-java/rest/resteasy/json-example-with-resteasy-jackson/)

### build

```
mvn clean package
```

### run 

```
java -cp target/lib/*:target/rest.jar com.embedded.WebServer 
```

### test

```
$ curl http://localhost:9009/echo/hi
GET Echo: hi

$ curl -X POST -H "content-type: application/json" -d '{"test": "hi"}' http://localhost:9009/echo
POST Echo: hi
```
