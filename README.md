# LiterAlura 📚

Projeto desenvolvido em Java com Spring Boot como entrega final do Challenge da Alura: LiterAlura.

O desafio consistiu em construir uma aplicação que consome dados de uma API pública de livros, processa as informações e persiste no banco de dados, explorando conceitos fundamentais do ecossistema Spring.

---

## 🚀 Tecnologias usadas

- Java 17+
- Spring Boot (Web, Data JPA)
- Jackson (JSON)
- PostgreSQL
- Maven

---

## 🔧 Configuração

### Pré-requisitos

- Java JDK 17+
- Maven
- PostgreSQL
- IDE (IntelliJ, VSCode, Eclipse, etc)

### Configurar conexão com o banco

No arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
