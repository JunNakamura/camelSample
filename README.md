# camelSample
sample app of Apache Camel

# build

```
cd camelSample
mvn clean install
```

you use target/geo-XXX-jar-with-dependencies.jar as below

`
java -jar geo-XXX-jar-with-dependencies.jar
`

# develop

you can use the followings maven commands.

```
mvn camel:run
```

if you want to run with hawtio.
```
mvn hawtio:camel
```
