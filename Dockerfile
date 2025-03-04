# Utiliser une image officielle Java 17
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR généré par Maven
COPY target/microservice-produits-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port sur lequel tourne l'application
EXPOSE 8081

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar"]