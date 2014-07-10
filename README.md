
# embedded jetty rest

[![Build Status](https://travis-ci.org/scotthaleen/embedded-jetty-rest.svg?branch=master)](http://travis-ci.org/scotthaleen/embedded-jetty-rest)

sample implementation based on <br />
- [http://news-anand.blogspot.com/2012/05/today-i-am-going-tell-you-how-to-create.html](http://news-anand.blogspot.com/2012/05/today-i-am-going-tell-you-how-to-create.html)
- [http://examples.javacodegeeks.com/enterprise-java/rest/resteasy/json-example-with-resteasy-jackson/](http://examples.javacodegeeks.com/enterprise-java/rest/resteasy/json-example-with-resteasy-jackson/)

### build

```
mvn clean package
mvn assembly:assembly
```

This will produce a deployable tar.gz in the _target/_ folder
(**target/web-server-{VERSION}-bundle.tar.gz**)

### deploy

```
$ tar -zxvf web-server-{VERSION}-bundle.tar.gz
```

### run 

```
$ chmod +x run.sh
$ ./run.sh
```
or 

```
$ java -cp .:lib/* com.embedded.WebServer 
```

### test

```
$ curl http://localhost:9009/echo/hi
GET Echo: hi

$ curl -X POST -H "content-type: application/json" -d '{"echo": "hi"}' http://localhost:9009/echo
POST Echo: hi
```
