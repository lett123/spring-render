#Etapa de cosntrução
FROM maven:3.4.3-openjdk-21 AS build
#FROM ubuntu:latest AS build
#Definir o diretorio dentro do container para a aplicação
WORKDIR /app

#Copiar o pom.xml para o container
COPY pom.xml .
COPY src ./src

#Executar o maven para compilar projeto e gerar o arquivo JAR
RUN mvn clean package -DskipTests

#Etapa de execução 
FROM openjdk:21-slim 

#Definir o diretorio de trabalho para a aplicação 
WORKDIR /app

#Copiar o JAR construido na etapa anterior
COPY --from=build /app/target/*.jar app.jar

#definir a porta que sera utilizada na aplicação
EXPOSE 8080

#Comando para executar a aplicação
ENTRYPOINT [ "java", "-jar", app.jar ]

