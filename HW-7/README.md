Campus TaskBoard API

Description: A Restful API with Spring Boot that allows users to manage tasks. The API supports creating, reading, updating and deleting tasks with input validation.

How to run the application?

To run this application you will need Java 17 or higher installed on your computer. 

Once you have Java installed, clone this repository to your computer and open the project folder in VS Code or any IDE of your choice.

To start the application, open the terminal inside the project folder and run the following command:

On Mac or Linux:
cd campus-taskboard./mvnw spring-boot:run

On Windows:
mvnw.cmd spring-boot:run

Wait for the application to start. When you see the message "Started CampusTaskboardApplication" in the terminal, the server is running successfully.

You can now open your browser and go to http://localhost:8080 to see the API working. You should see an empty array [] if no tasks have been created yet.

To test all the endpoints you can use Postman or any API testing tool of your choice.

API endpoints documentation

HW 5

Application starting successfully (console output)
<img width="1090" height="22" alt="Screenshot 2026-03-26 at 7 17 31 PM" src="https://github.com/user-attachments/assets/7ee1b153-e3cc-473e-bd4d-dd43ddfdd2f0" />

GET /api/tasks endpoint working (Postman or browser)
<img width="842" height="159" alt="Screenshot 2026-03-30 at 2 01 12 PM" src="https://github.com/user-attachments/assets/3591182b-0f5c-4422-8511-e5e1d5de4dc8" />
<img width="842" height="159" alt="Screenshot 2026-03-30 at 2 01 12 PM" src="https://github.com/user-attachments/assets/77c61fb7-5e4f-4977-907b-ecafffdf6e75" />


POST /api/tasks creating a task 
![preview](https://github.com/user-attachments/assets/e84852c3-8c84-442a-864e-fed22fa55d97)

GET /api/tasks/{id} retrieving a task
![Screebshot](https://github.com/user-attachments/assets/eb236237-85af-45cb-ba52-38d359273d3b)

PUT /api/tasks/{id} updating a task
![Screenshot copy](https://github.com/user-attachments/assets/c17b0ab2-acce-4b73-a604-003fb6c84439)

DELETE /api/tasks/{id} deleting a task
![Screenshot copy 2](https://github.com/user-attachments/assets/1550b313-08c2-4444-8593-b1d8af4cfa84)

Validation error example (show invalid request and error response)
<img width="1267" height="601" alt="Screenshot 2026-03-30 at 2 51 33 PM" src="https://github.com/user-attachments/assets/f56c4582-c469-4bb7-b7f2-ca8931bd55b4" />

At least 2-3 tasks created and displayed
<img width="1267" height="496" alt="Screenshot 2026-03-31 at 4 13 10 PM" src="https://github.com/user-attachments/assets/90b07648-aa94-4ec7-825c-8f746068ca94" />

HW 6

H2 Console with your data (show table structure and sample data)
<img width="533" height="368" alt="Screenshot 2026-04-07 at 6 40 46 PM" src="https://github.com/user-attachments/assets/9b676996-b97b-4f78-ab93-bfb56271e735" />
<img width="1026" height="172" alt="Screenshot 2026-04-11 at 5 00 38 PM" src="https://github.com/user-attachments/assets/628b5075-dc7e-4815-8257-b2162856eef9" />

GET /api/tasks/completed endpoint working
<img width="1255" height="844" alt="Screenshot 2026-04-11 at 5 07 05 PM" src="https://github.com/user-attachments/assets/f6818677-62e5-4caf-ae17-bdb4a7bdca18" />

GET /api/tasks/incomplete endpoint working
<img width="1267" height="844" alt="Screenshot 2026-04-11 at 5 08 05 PM" src="https://github.com/user-attachments/assets/1adc5fb2-8e20-4cec-9519-e9a51bbfb5d2" />

GET /api/tasks/priority/HIGH endpoint working
<img width="1267" height="879" alt="Screenshot 2026-04-11 at 5 08 52 PM" src="https://github.com/user-attachments/assets/8fe92b50-2118-4238-a857-0f89c49dfc16" />

GET /api/tasks/search?keyword=... endpoint working
<img width="1267" height="811" alt="Screenshot 2026-04-11 at 5 10 59 PM" src="https://github.com/user-attachments/assets/1240e967-68c9-4d48-a367-9ae2d614e31a" />

GET /api/tasks/paginated?page=0&size=5 endpoint working (show pagination metadata)
<img width="1267" height="842" alt="Screenshot 2026-04-11 at 5 13 49 PM" src="https://github.com/user-attachments/assets/9c31d807-259a-4513-8693-ffd143a30c0a" />
<img width="1267" height="645" alt="Screenshot 2026-04-11 at 5 14 53 PM" src="https://github.com/user-attachments/assets/e292f633-f6a0-4fa4-9540-f926328ab918" />
<img width="1267" height="172" alt="Screenshot 2026-04-11 at 5 15 06 PM" src="https://github.com/user-attachments/assets/847ce52d-4515-4aec-b20c-f8a4b360b830" />

SQL queries visible in console (if show-sql=true)
<img width="1454" height="736" alt="Screenshot 2026-04-11 at 5 20 35 PM" src="https://github.com/user-attachments/assets/90c2ce8b-7eca-4f2d-9f3c-ce22249c70fb" />
<img width="1454" height="319" alt="Screenshot 2026-04-11 at 5 21 43 PM" src="https://github.com/user-attachments/assets/96287fee-2ea6-4ecb-9710-47fcf61258db" />

HW 7
Error responses (404, 400, 500)
<img width="1272" height="282" alt="Screenshot 2026-04-26 at 5 50 30 PM" src="https://github.com/user-attachments/assets/49da554d-96e7-4159-92b9-731a5ce687f3" />
<img width="1272" height="282" alt="Screenshot 2026-04-26 at 5 53 28 PM" src="https://github.com/user-attachments/assets/f28318cc-0de4-46fd-ae98-65364abf70ee" />
<img width="1272" height="282" alt="Screenshot 2026-04-26 at 5 54 59 PM" src="https://github.com/user-attachments/assets/5948fea1-b094-4532-ba94-9de6438b1756" />

Soft delete working
<img width="1272" height="805" alt="Screenshot 2026-04-26 at 5 57 05 PM" src="https://github.com/user-attachments/assets/6a6645b4-f9c6-4e8d-90df-3efdd43afcd1" />
<img width="1272" height="193" alt="Screenshot 2026-04-26 at 5 57 15 PM" src="https://github.com/user-attachments/assets/23fd8b9b-5c6c-43cc-b934-46661e629860" />
<img width="1286" height="571" alt="Screenshot 2026-04-26 at 5 57 52 PM" src="https://github.com/user-attachments/assets/72a90ecc-ece3-4ddb-a09c-439a2d3d744c" />
<img width="1286" height="769" alt="Screenshot 2026-04-26 at 5 58 32 PM" src="https://github.com/user-attachments/assets/a12e7af4-7f6a-4ca8-a4f2-f1cb5674944c" />
<img width="1286" height="181" alt="Screenshot 2026-04-26 at 5 59 25 PM" src="https://github.com/user-attachments/assets/c9c45ff4-d25b-44ce-b7ce-dc4ab2fc087b" />

Health endpoint
<img width="1039" height="547" alt="Screenshot 2026-04-26 at 5 39 02 PM" src="https://github.com/user-attachments/assets/63754018-272b-4837-b6a5-31afc78ab634" />

Request logging in console
<img width="1286" height="78" alt="Screenshot 2026-04-26 at 6 01 30 PM" src="https://github.com/user-attachments/assets/b70cdc38-d0c0-4827-ae30-1bed4970cfa5" />


Video Link (HW 5)
https://youtu.be/Y9Qv9jL0VNQ

Video Link (HW 6) 
https://youtu.be/KXFYitOg2uE

Video Link (HW 7)
https://youtu.be/mnLHh9ZzXHQ

