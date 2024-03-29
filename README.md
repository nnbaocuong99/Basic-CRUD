<h1 align="center">Basic crud for report session✨</h1>

### 1. Informations / What I'm using
- Language: Java
- IDE: [Intellij](https://www.jetbrains.com/idea/)
- Build: Docker, VScode
- API Platform test: [Postman](https://www.postman.com/product/what-is-postman/), [Swagger UI](https://swagger.io/tools/swagger-ui/)

### 2. In this project:
- [Source code](https://github.com/nnbaocuong99/Basic-CRUD/tree/main/src/main)
- [Dockerfile](https://github.com/nnbaocuong99/Basic-CRUD/blob/main/Dockerfile)
- [pom.xml](https://github.com/nnbaocuong99/Basic-CRUD/blob/main/pom.xml)
- Dependencies import
```java
digraph "org.example:demo_restful:jar:1.0-SNAPSHOT" { 
	"org.example:demo_restful:jar:1.0-SNAPSHOT" -> "org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" ; 
	"org.example:demo_restful:jar:1.0-SNAPSHOT" -> "org.springframework.boot:spring-boot-starter-web:jar:2.4.5:compile" ; 
	"org.example:demo_restful:jar:1.0-SNAPSHOT" -> "mysql:mysql-connector-java:jar:8.0.23:runtime" ; 
	"org.example:demo_restful:jar:1.0-SNAPSHOT" -> "io.springfox:springfox-swagger2:jar:2.9.2:compile" ; 
	"org.example:demo_restful:jar:1.0-SNAPSHOT" -> "io.springfox:springfox-bean-validators:jar:2.9.2:compile" ; 
	"org.example:demo_restful:jar:1.0-SNAPSHOT" -> "io.springfox:springfox-swagger-ui:jar:2.9.2:compile" ; 
	"org.example:demo_restful:jar:1.0-SNAPSHOT" -> "org.springframework.boot:spring-boot-starter-validation:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot-starter-aop:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot-starter-jdbc:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" -> "jakarta.transaction:jakarta.transaction-api:jar:1.3.3:compile" ; 
	"org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" -> "jakarta.persistence:jakarta.persistence-api:jar:2.2.3:compile" ; 
	"org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" -> "org.hibernate:hibernate-core:jar:5.4.30.Final:compile" ; 
	"org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" -> "org.springframework.data:spring-data-jpa:jar:2.4.8:compile" ; 
	"org.springframework.boot:spring-boot-starter-data-jpa:jar:2.4.5:compile" -> "org.springframework:spring-aspects:jar:5.3.6:compile" ; 
	"org.springframework.boot:spring-boot-starter-aop:jar:2.4.5:compile" -> "org.springframework:spring-aop:jar:5.3.6:compile" ; 
	"org.springframework.boot:spring-boot-starter-aop:jar:2.4.5:compile" -> "org.aspectj:aspectjweaver:jar:1.9.6:compile" ; 
	"org.springframework.boot:spring-boot-starter-jdbc:jar:2.4.5:compile" -> "com.zaxxer:HikariCP:jar:3.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter-jdbc:jar:2.4.5:compile" -> "org.springframework:spring-jdbc:jar:5.3.6:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "org.jboss.logging:jboss-logging:jar:3.4.1.Final:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "org.javassist:javassist:jar:3.27.0-GA:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "net.bytebuddy:byte-buddy:jar:1.10.22:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "antlr:antlr:jar:2.7.7:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "org.jboss:jandex:jar:2.2.3.Final:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "org.dom4j:dom4j:jar:2.1.3:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "org.hibernate.common:hibernate-commons-annotations:jar:5.1.2.Final:compile" ; 
	"org.hibernate:hibernate-core:jar:5.4.30.Final:compile" -> "org.glassfish.jaxb:jaxb-runtime:jar:2.3.4:compile" ; 
	"org.glassfish.jaxb:jaxb-runtime:jar:2.3.4:compile" -> "jakarta.xml.bind:jakarta.xml.bind-api:jar:2.3.3:compile" ; 
	"org.glassfish.jaxb:jaxb-runtime:jar:2.3.4:compile" -> "org.glassfish.jaxb:txw2:jar:2.3.4:compile" ; 
	"org.glassfish.jaxb:jaxb-runtime:jar:2.3.4:compile" -> "com.sun.istack:istack-commons-runtime:jar:3.0.12:compile" ; 
	"org.glassfish.jaxb:jaxb-runtime:jar:2.3.4:compile" -> "com.sun.activation:jakarta.activation:jar:1.2.2:runtime" ; 
	"org.springframework.data:spring-data-jpa:jar:2.4.8:compile" -> "org.springframework.data:spring-data-commons:jar:2.4.8:compile" ; 
	"org.springframework.data:spring-data-jpa:jar:2.4.8:compile" -> "org.springframework:spring-orm:jar:5.3.6:compile" ; 
	"org.springframework.data:spring-data-jpa:jar:2.4.8:compile" -> "org.springframework:spring-context:jar:5.3.6:compile" ; 
	"org.springframework.data:spring-data-jpa:jar:2.4.8:compile" -> "org.springframework:spring-tx:jar:5.3.6:compile" ; 
	"org.springframework.data:spring-data-jpa:jar:2.4.8:compile" -> "org.springframework:spring-beans:jar:5.3.6:compile" ; 
	"org.springframework.data:spring-data-jpa:jar:2.4.8:compile" -> "org.springframework:spring-core:jar:5.3.6:compile" ; 
	"org.springframework:spring-core:jar:5.3.6:compile" -> "org.springframework:spring-jcl:jar:5.3.6:compile" ; 
	"org.springframework.boot:spring-boot-starter-web:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot-starter:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter-web:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot-starter-json:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter-web:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot-starter-tomcat:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter-web:jar:2.4.5:compile" -> "org.springframework:spring-web:jar:5.3.6:compile" ; 
	"org.springframework.boot:spring-boot-starter-web:jar:2.4.5:compile" -> "org.springframework:spring-webmvc:jar:5.3.6:compile" ; 
	"org.springframework.boot:spring-boot-starter:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot-autoconfigure:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter:jar:2.4.5:compile" -> "org.springframework.boot:spring-boot-starter-logging:jar:2.4.5:compile" ; 
	"org.springframework.boot:spring-boot-starter:jar:2.4.5:compile" -> "jakarta.annotation:jakarta.annotation-api:jar:1.3.5:compile" ; 
	"org.springframework.boot:spring-boot-starter:jar:2.4.5:compile" -> "org.yaml:snakeyaml:jar:1.27:compile" ; 
	"org.springframework.boot:spring-boot-starter-logging:jar:2.4.5:compile" -> "ch.qos.logback:logback-classic:jar:1.2.3:compile" ; 
	"org.springframework.boot:spring-boot-starter-logging:jar:2.4.5:compile" -> "org.apache.logging.log4j:log4j-to-slf4j:jar:2.13.3:compile" ; 
	"org.springframework.boot:spring-boot-starter-logging:jar:2.4.5:compile" -> "org.slf4j:jul-to-slf4j:jar:1.7.30:compile" ; 
	"ch.qos.logback:logback-classic:jar:1.2.3:compile" -> "ch.qos.logback:logback-core:jar:1.2.3:compile" ; 
	"org.apache.logging.log4j:log4j-to-slf4j:jar:2.13.3:compile" -> "org.apache.logging.log4j:log4j-api:jar:2.13.3:compile" ; 
	"org.springframework.boot:spring-boot-starter-json:jar:2.4.5:compile" -> "com.fasterxml.jackson.core:jackson-databind:jar:2.11.4:compile" ; 
	"org.springframework.boot:spring-boot-starter-json:jar:2.4.5:compile" -> "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.11.4:compile" ; 
	"org.springframework.boot:spring-boot-starter-json:jar:2.4.5:compile" -> "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.11.4:compile" ; 
	"org.springframework.boot:spring-boot-starter-json:jar:2.4.5:compile" -> "com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.11.4:compile" ; 
	"com.fasterxml.jackson.core:jackson-databind:jar:2.11.4:compile" -> "com.fasterxml.jackson.core:jackson-core:jar:2.11.4:compile" ; 
	"org.springframework.boot:spring-boot-starter-tomcat:jar:2.4.5:compile" -> "org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.45:compile" ; 
	"org.springframework.boot:spring-boot-starter-tomcat:jar:2.4.5:compile" -> "org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.45:compile" ; 
	"org.springframework:spring-webmvc:jar:5.3.6:compile" -> "org.springframework:spring-expression:jar:5.3.6:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "io.swagger:swagger-annotations:jar:1.5.20:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "io.swagger:swagger-models:jar:1.5.20:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "io.springfox:springfox-spi:jar:2.9.2:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "io.springfox:springfox-schema:jar:2.9.2:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "io.springfox:springfox-swagger-common:jar:2.9.2:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "io.springfox:springfox-spring-web:jar:2.9.2:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "com.google.guava:guava:jar:20.0:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "com.fasterxml:classmate:jar:1.5.1:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "org.slf4j:slf4j-api:jar:1.7.30:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "org.springframework.plugin:spring-plugin-core:jar:1.2.0.RELEASE:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "org.springframework.plugin:spring-plugin-metadata:jar:1.2.0.RELEASE:compile" ; 
	"io.springfox:springfox-swagger2:jar:2.9.2:compile" -> "org.mapstruct:mapstruct:jar:1.2.0.Final:compile" ; 
	"io.swagger:swagger-models:jar:1.5.20:compile" -> "com.fasterxml.jackson.core:jackson-annotations:jar:2.11.4:compile" ; 
	"io.springfox:springfox-spi:jar:2.9.2:compile" -> "io.springfox:springfox-core:jar:2.9.2:compile" ; 
	"org.springframework.boot:spring-boot-starter-validation:jar:2.4.5:compile" -> "org.glassfish:jakarta.el:jar:3.0.3:compile" ; 
	"org.springframework.boot:spring-boot-starter-validation:jar:2.4.5:compile" -> "org.hibernate.validator:hibernate-validator:jar:6.1.7.Final:compile" ; 
	"org.hibernate.validator:hibernate-validator:jar:6.1.7.Final:compile" -> "jakarta.validation:jakarta.validation-api:jar:2.0.2:compile" ; 
```

### ✨How to use
1. build image:
```ruby
docker build -t crud-test:test .
```

2. Run, Start:
```ruby
docker run -p 8181:8080 -d crud-test
```

3. Test: 
Access: `localhost:8181` để test API
