# Spring Boot App

A basic Java Spring Boot app by following this [video tutorial](https://www.youtube.com/watch?v=Cw0J6jYJtzw).

## Steps
```text

Create blank Spring Boot project using IntelliJ
- remove the last portion of the pacakge name
- choose matching jdk version (e.g. 21)
- select the Spring Web dependency

Create /hello endpoint
    - annotate the main app class with RestController
    - create new method that returns a string
    - annotate it with GetMapping

Create http request
    - in project root
    - make sure the protocol is http and not https
    - verify the endpoint

Create new Java model
    - create new class SoftwareEngineer
    - fields: id: int, name: str, tech stack: str
    - all field are private
    - create getters and setters
    - create equalsTo and hashCode
    - don't create toString
    - use the intellij tools

Create new controller
    - create new class SoftwareEngineerController
    - annotate with RestController
    - annotate with RequestMapping to add prefix in uri
    - use api/v1/software-engineers

Create method for GET requests
    - public method
    - return type: List<SoftwareEngineer>
    - make it return hardcoded data for now (=mocked data)
    - create new http request and verify

Setup Docker
    - Install if needed.

Start db
    - use docker compose to run postgres db
    - create compose.yml
    - a single service - postgres-spring-boot
    - network and volume

Start the container
    - `docker compose up -d`
    - `docker ps`
    - `docker compose logs`

Add dependencies
    - go to pom.xml, dependencies section
    - click on "Add starters" popup
    - add SQL > Postgres
    - add SQL > Spring data JPA
    - restart the app; it fails because db credentials are not set

Configure spring
    - go to application.properties
    - final version:
      ```none
      spring.application.name=spring-boot
      spring.datasource.url=jdbc:postgresql://localhost:5332/mydb
      spring.datasource.username=user
      spring.datasource.password=pass
      spring.datasource.driver-class-name=org.postgresql.Driver
      spring.jpa.hibernate.ddl-auto=create-drop
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
      spring.jpa.properties.hibernate.format_sql=true
      spring.jpa.show-sql=true
      ```
    - restart the app; fails because db does not exist

Fix "database doesn't exist" by manually creating it
    - `docker exec -it <container name> bash`
    - running just psql fails
    - run with the db user: psql --user hristo
    - (note) single command to run a psql in the container: `docker exec -it postgres-springboot3 psql --user user`
    - (note) psql cli commands: https://gist.github.com/philippetedajo/91341cb4d14c7b07e381d70839acf0f5
    - create a new db: create database mydb;
    - run `\dt` -> there aren't any tables
    - keep the psql session open

Create table to store software engineers
    - annotate the model class with @Entity
    - mark the id with @Id to make pk
    - restart app; this migrates the changes from the model to the db
    - return to the psql terminal session from above
    - run `\dt` -> confirm the table is created

```


## Approach

1. First pass
   - Watch the tutorial section by section, writing code after each part.
   - Take notes.
   - Try to finish in x3 the tutorial duration.

1. Second pass
   - Recreate the app using mainly the notes.
   - Referring to the video only when needed.
   - Explain each step out loud to yourself.
   - Try to finish in x2 the tutorial duration.

1. Third pass
   - Create the app from scratch again.
   - This time initializing a git repo and commit the changes.
   - Push to a remote.
   - Try to finish in x1 the tutorial duration.
