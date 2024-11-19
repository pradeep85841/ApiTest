Description:
This project demonstrates how to automate tests for a RESTful API using RestAssured in Java. The example provided tests the /posts endpoint of the JSONPlaceholder API.

Prerequisites:
Java (Version 8 or higher)
Maven (or another build tool such as Gradle)
Git

Step-by-Step Instructions:
1. Clone the Repository
To clone the repository to your local machine, follow these steps:

Open your terminal or command prompt.
Navigate to the directory where you want to clone the repository.
Run the following command:

git clone [https://github.com/your-username/your-repository-name.git](https://github.com/pradeep85841/ApiTest.git)

After cloning, navigate to the project directory:

cd ApiTest
2. Import the Project into Your IDE (Optional)

For IntelliJ IDEA:

Open IntelliJ IDEA and select "Open".
Navigate to the cloned project folder and select it.
IntelliJ will automatically detect the Maven project and import it or right click on pom.xml file to select Add Maven option.


mvn clean install
This will download the necessary dependencies and compile the project.

4. Run the Tests
Using Maven:
To run the tests with Maven, use the following command:

mvn test
This will execute the tests defined in the src/test/java/org/api/TestApi.java directory. Ensure that your JUnit framework is configured correctly.
