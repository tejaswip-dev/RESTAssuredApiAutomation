markdown
# REST Assured API Automation

This project is a **REST Assured API Automation Framework** built using Java.

This project is a robust API automation framework built using Java, Maven, REST Assured, and TestNG. It automates the testing of the Restful-booker API to demonstrate key API testing concepts such as CRUD operations, authentication handling, data modeling (POJOs/Builders), and dynamic test data management.

## Key Features

*   **Authentication Handling:** Demonstrates generation and usage of authentication tokens.
*   **CRUD Operations:** Covers all major HTTP methods like `GET`, `POST`, and `PUT`.
*   **API Chaining:** Shows how to reuse dynamic data between test cases.

## 🚀 Technologies Used

Language: Java

Build Tool: Maven

API Automation Library: REST Assured

Test Framework: TestNG

JSON Processing: Jackson Databind

Version Control: Git

## 📋 Project Structure

The project follows the standard Maven directory structure and incorporates the Page Object Model (POM) concept adapted for API services:

src/main/java/com/api/

├── base/             # Base classes, RequestSpecification setup, common utilities
├── models/           # POJOs (Plain Old Java Objects) for JSON Request/Response mapping
│   ├── request/      # Request payloads (e.g., BookingRequest, LoginRequest)
│   └── response/     # Response models (e.g., BookingResponse, LoginResponse)
└── services/         # Service layer classes containing methods for API calls (GET, POST, PUT, DELETE)
    
src/test/java/com/api/
└── tests/            # TestNG test classes containing test cases and assertions

testng.xml            # Test suite configuration file
pom.xml               # Maven configuration and dependencies
README.md             # Project documentation (this file)

## ⚙️ Setup and Installation

Clone the Repository:
bash
git clone github.com[Your_Username]/[Your_Repo_Name].git
cd [Your_Repo_Name]
Use code with caution.
Please check the **`pom.xml`** file for dependencies.

## Prerequisites:

Ensure Java JDK 8+ is installed.
Ensure Maven is installed and configured in your system's PATH.
Build the Project:
Navigate to the project root directory and run the Maven clean install command to download dependencies and compile the code:
bash
mvn clean install
Use code with caution.

## 🏃‍♀️ How to Run Tests

Tests can be run via the testng.xml file, the Maven command line, or directly within your IDE (Eclipse/IntelliJ) using the TestNG plugin.
Run All Tests via Maven Command Line:
bash
mvn test
Use code with caution.

## Run Tests via testng.xml file:

You can execute the tests using the configured TestNG XML suite file:
bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
Use code with caution.

## Run Specific Test Class:

To run only a single test class (e.g., UpdateBookingTest):
bash
mvn test -Dtest=UpdateBookingTest
Use code with caution.

## ✅ Key Workflows Automated

This framework demonstrates several key API automation scenarios:
**Authentication:** Generating an authentication token using POST /auth and using that token in subsequent requests (Cookie-based auth).
**CRUD Operations:** Full end-to-end testing of POST, GET, PUT, and DELETE requests for the /booking endpoint.
**API Chaining:** Dynamically extracting a bookingid from a POST response and using it as a path parameter in a subsequent PUT request.
**Data Modeling:** Using the Builder pattern in POJOs to create clean, readable test data payloads.

## 🤝 Contribution

Feel free to fork this repository, add more tests, improve the framework structure, or fix bugs. Pull requests are welcome!


