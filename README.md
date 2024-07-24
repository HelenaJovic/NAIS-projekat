## Cassandra Columnar Database Microservice

Welcome to the Cassandra Columnar Database Microservice! This repository contains the source code for a microservice designed to handle analytics and document generation related to workshops, using Cassandra as the columnar database. This microservice is part of a larger system for managing a psychological clinic.

## Technologies Used

### Backend
- **Java Spring Boot:** Used to develop the backend services.
- **Apache Cassandra:** Employed as the columnar database for storing and analyzing workshop data.
- **Apache Kafka:** Utilized for implementing the Saga pattern to ensure data consistency across microservices.

### Microservice Architecture
- **Microservice Architecture:** The application follows a microservice architecture, allowing for independent development and scaling of each service.

## Features

### Data Management
- **Columnar Storage:** Efficient storage and retrieval of workshop data using Cassandra.
- **Real-time Analytics:** Perform real-time analytics on workshop participation and feedback.

### Saga Pattern Implementation
- **Kafka Integration:** Use Kafka to implement the Saga pattern for ensuring data consistency.
- **Graph Database Synchronization:** For every student added to the graph database (Neo4j), the count for the "student" category in the workshop data within Cassandra is incremented by 1.

### Document Generation
- **Analytics Reports:** Generate detailed documents related to the analysis of workshop data.
- **Automated Reports:** Automated generation and storage of reports for further analysis and review.

## Installation

### Prerequisites
- Java 11 or higher
- Apache Cassandra
- Apache Kafka
- Maven

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository-url.git
   ```
2. Navigate to the project directory:
   ```bash
   cd cassandra-microservice
   ```
3. Install dependencies and build the project:
   ```bash
   mvn clean install
   ```
4. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

### Configuration

#### Database Configuration
Ensure that your Cassandra database is properly configured. Update the application.properties file in the backend directory with your database credentials and connection details.

#### Kafka Configuration
Ensure that Kafka is properly configured and running. Update the application.properties file with your Kafka server details.

### Environment Variables
Set up necessary environment variables for both database and Kafka configurations as required.

## Usage

Once the microservice is up and running, it will automatically listen for events from Kafka. When a new student is added to the graph database, the microservice will increment the relevant count in Cassandra and generate analytical documents.

## Contribution

We welcome contributions to improve this project. Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes and push them to your forked repository.
4. Submit a pull request with a detailed description of your changes.
