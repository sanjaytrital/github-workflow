# GitHub Workflow

A Spring Boot application demonstrating CI/CD best practices with GitHub Actions workflows for testing, security scanning, and branch protection.

## 📋 Project Overview

This is a Spring Boot 3.3.4 project that implements a simple User Management API with REST endpoints. The project is configured with:

- **Java 21** with Spring Boot 3.3.4
- **REST API** for user management
- **Lombok** for code generation
- **Maven** as build tool
- **GitHub Actions** for CI/CD pipeline
- **Unit Tests** and security scanning

## 🚀 Features

### API Endpoints
- `GET /v1/users` - Retrieve all users
- `GET /v1/users/{id}` - Get user by ID

## 🛠️ Prerequisites

- **Java 21** or higher
- **Maven 3.6+**

## 📦 Dependencies

### Core Dependencies
- Spring Boot Starter Web (REST API support)
- Spring Boot Starter JSON (JSON processing)
- Lombok (Code generation)
- Spring Boot Starter Test (Testing framework)

See `pom.xml` for complete dependency list.

## 🔧 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/github-workflow.git
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### 4. Run Tests
```bash
mvn clean test
```

## 📝 Usage Examples

### Get All Users
```bash
curl -X GET http://localhost:8080/v1/users
```

### Get User by ID
```bash
curl -X GET http://localhost:8080/v1/users/user123
```

## 🧪 Testing

### Running All Tests
```bash
mvn clean test
```

### Running Specific Test Class
```bash
mvn test -Dtest=TestUserController
```

### Running with Coverage (if configured)
```bash
mvn clean test jacoco:report
```

## 📊 Build & Deployment

### Development Build
```bash
mvn clean install
```

### Production Build
```bash
mvn clean install -DskipTests
```

### Package as JAR
```bash
mvn package
```

Run the JAR:
```bash
java -jar target/github-workflow-1.0-SNAPSHOT.jar
```

### Commit Convention
```
<type>(<scope>): <subject>

<body>

<footer>
```

Examples:
- `feat(user): add user deletion endpoint`
- `fix(service): handle null user gracefully`
- `test(controller): add test for getAllUsers`
- `chore(deps): update spring-boot to 3.3.5`

## 📋 Checklist Before Push

- [ ] Code follows project style guide
- [ ] Tests written and passing
- [ ] No security vulnerabilities introduced
- [ ] Documentation updated if needed
- [ ] Commit messages are clear
- [ ] Branch is up-to-date with main