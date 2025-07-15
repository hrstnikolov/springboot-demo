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
