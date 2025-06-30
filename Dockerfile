# Fase de construcción
FROM eclipse-temurin:17-jdk AS builder
WORKDIR /workspace

# 1. Copia solo los archivos necesarios para descargar dependencias primero
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:go-offline

# 2. Copia el código fuente y construye
COPY src src
RUN ./mvnw clean package -DskipTests

# Fase de ejecución
FROM eclipse-temurin:17-jre
WORKDIR /app

# 3. Copia el JAR específico (no uses wildcard *)
COPY --from=builder /workspace/target/mcs-motor-transferencia-0.0.1-SNAPSHOT.jar app.jar

# Puerto y comando
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]