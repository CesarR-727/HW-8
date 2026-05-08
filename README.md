Campus TaskBoard API

Description: A Restful API with Spring Boot that allows users to manage tasks. The API supports creating, reading, updating and deleting tasks with input validation.

How to run the application?

To run this application you will need Java 17 or higher installed on your computer.

Once you have Java installed, clone this repository to your computer and open the project folder in VS Code or any IDE of your choice.

To start the application, open the terminal inside the project folder and run the following command:

On Mac or Linux: cd campus-taskboard./mvnw spring-boot:run

On Windows: mvnw.cmd spring-boot:run

Wait for the application to start. When you see the message "Started CampusTaskboardApplication" in the terminal, the server is running successfully.

You can now open your browser and go to http://localhost:8080 to see the API working. You should see an empty array [] if no tasks have been created yet.

To test all the endpoints you can use Postman or any API testing tool of your choice.

API endpoints documentation

Security configuration (show SecurityConfig class)
<img width="987" height="879" alt="Screenshot 2026-05-06 at 4 48 19 PM" src="https://github.com/user-attachments/assets/a0a7bfcc-1cb3-462a-a79b-d281353d73eb" />

API documentation (Swagger UI with endpoints visible)
<img width="1460" height="773" alt="Screenshot 2026-05-06 at 4 42 52 PM" src="https://github.com/user-attachments/assets/510795c9-c256-487e-a126-826b50b635ac" />

Tests passing (show test results in IDE or console)
<img width="992" height="147" alt="Screenshot 2026-05-06 at 4 36 02 PM" src="https://github.com/user-attachments/assets/41494c47-16fa-4d27-ada6-6801c7b7eb1f" />

Health endpoint working (/actuator/health)
<img width="163" height="71" alt="Screenshot 2026-05-06 at 4 46 34 PM" src="https://github.com/user-attachments/assets/60761f15-b701-40c4-b0fb-84b2aaa4758c" />
