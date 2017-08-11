# Spring Boot sample project

To try it from IntelliJ IDEA:

1. First, `git clone` the project.
1. Go to menu _File, Open_. Select the `pom.xml` file and open as project.
1. Run the `MyApplication` class.
The server will start in a couple of seconds
(you'll see something like `Started MyApplication in 3.823 seconds` in the console).
1. You may open [http://localhost:8080](http://localhost:8080)
in your browser to see the output of
[MyController.index()](https://github.com/fmaylinch/springboot-sample/blob/master/src/main/java/com/codethen/springboot/sample/controller/MyController.java#L12).
1. There you'll see a link to [books](http://localhost:8080/books) where you'll see the output of
[BookController.viewBooks()](https://github.com/fmaylinch/springboot-sample/blob/master/src/main/java/com/codethen/springboot/sample/controller/BookController.java#L13).      

If you change anything, restart the server and refresh your browser page.
