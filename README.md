# springboot-multi-module

This is a Spring Boot multi-module project with a shared module, a REST application, and a Kafka module.

## Project Structure


## Modules

- **user-shared**: Contains DTOs, entities, mappers, utilities, and shared logic.
- **user-http**: REST application module.
- **user-kafka**: Kafka producer/consumer module.

## Build & Run

Build all modules using Gradle from the root directory:

```bash
./gradlew clean build

./gradlew :user-http:bootRun
