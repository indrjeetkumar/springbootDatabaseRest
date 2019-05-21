"Spring Boot Postgres Rest web service example"

Building the application
1.1 Clone the repository git clone https://github.com/indrjeetkumar/springbootDatabaseRest.git

1.2 you can generate the project using Spring Initializr web tool by following the instructions below - • Head over to http://start.spring.io. • Enter postgres-demo in the Artifact field. • Add Web, in the dependencies section. • Click Generate Project to download the project.

1.3 you can create a project through the STS editor

Run the app
2.1 Type the following command from the root directory of the project to run it : mvn spring-boot:run

2.2 Alternatively, you can package the application in the form of a JAR file and then run it like so - mvn clean package java -jar target/postgres-demo-0.0.1-SNAPSHOT.jar

2.3 Alternatively,you can run from the STS

Choose the springbootdatabaserest-> right click -> choose Run as -> choose spring boot application
