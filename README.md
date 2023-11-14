# RabbitMqSimpleApi


This Spring Boot application demonstrates how to publish JSON messages to RabbitMQ using a REST API endpoint.

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository.
2. Ensure RabbitMQ is installed and running.
3. Configure RabbitMQ credentials in the `application.properties` or `application.yml`.
4. Run the application using Maven or your IDE.

## Usage

### Send JSON Message
- Endpoint: `POST /api/v1/publish/user`
  - Sends a JSON message to RabbitMQ with user data.

#### Example Request:
```http
POST [../api/v1/publish/user] -->  (http://localhost:8080/api/v1/publish/user)  
Content-Type: application/json

{
  "id": 1,
  "name": "John Doe",
}

