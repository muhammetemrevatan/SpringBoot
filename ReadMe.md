# Getting Started
- Java 17
- Spring Boot
- Spring MVC
- Spring Data
- Spring Security
- Spring Rest

## Steps
> Spring MVC



### Reference

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Github](https://github.com/muhammetemrevatan/SpringBoot)
* [Swagger](httt//localhost:8080/swagger-ui.html)
* [H2 Console](http://localhost:8080/h2-console/l)

```sh
1. Step
$     ./mvnw clean package -DskipTests

2. Step
$     docker-compose up
$     docker ps

3. Step
POSTMAN

Added Product
http://localhost:8080/docker/v1/create/product

Listed Product
http://localhost:8080/docker/v1/list/product

Find Product
http://localhost:8080/docker/v1/find/product

Deleted Product
http://localhost:8080/docker/v1/delete/product

4. Step
$     docker exec -it spring_docker_postgresqldb_1 psql -U postgres studentdb

5. Step
$     studentdb=#  \dt ==> Showing tables
$     studentdb=#  \select * from product
$     studentdb=#  \q ==> exit




```
