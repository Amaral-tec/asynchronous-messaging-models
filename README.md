# Microservices-Based Java Application with RabbitMQ Messaging

## Overview

This is a Java-based microservices application designed to demonstrate the power of asynchronous messaging using RabbitMQ. The application is composed of multiple independent microservices that communicate through a RabbitMQ message broker. Asynchronous messaging enables these microservices to work together efficiently while maintaining loose coupling and scalability.

## Features

- **Microservices Architecture**: The application is built using a microservices architecture, where each microservice performs a specific function.

- **Asynchronous Communication**:
  - **RabbitMQ**: RabbitMQ is used for asynchronous communication between certain microservices, enhancing flexibility and responsiveness.
  - **Apache Kafka**: Apache Kafka is used to enable real-time streaming and event-driven communication between other parts of the application.

- **Message Queues**: Messages are exchanged between microservices through message queues, ensuring reliable and scalable message delivery.

## Prerequisites

Before running this application, make sure you have the following prerequisites:

- Java Development Kit (JDK)
- Maven (for building the project)
- RabbitMQ server (you can use a Docker container or install it locally)
- Apache Kafka and ZooKeeper (you can use a Docker container or install them locally)

## Getting Started

To get started with this application, follow these steps:

1. **Clone the Repository**:
   ```shell
   https://github.com/Amaral-tec/asynchronous-messaging-models.git

2. **Build the Project:**:
   ```shell
   cd C:\Documents\workspace-spring-tool-suite-4-4.19.1.RELEASE\asynchronous-messaging-models
   mvn clean install

3. **Run Microservices:**
Start the individual microservices by running their respective Java applications.

4. **RabbitMQ Setup:**
Ensure that RabbitMQ is up and running. Update the RabbitMQ configuration in each microservice if necessary.

5. **Apache Kafka Setup:**
Ensure that Apache Kafka and ZooKeeper are up and running. Update Kafka configuration in your Kafka-interacting microservices.

## License
This project is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
