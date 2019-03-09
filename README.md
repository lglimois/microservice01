# Introduction

Projet pour tester les microservices

## Appel Service REST depuis le back
cf. https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-resttemplate.html

Classr Wrapper List
cf. https://www.baeldung.com/spring-rest-template-list

cf. exemple implementé https://stackoverflow.com/questions/23674046/get-list-of-json-objects-with-spring-resttemplate


## Building jar including Angular client

### configurer front pour proxyfier le back
Suivre le tutorial:
cf. https://grokonez.com/java-integration/integrate-angular-4-springboot-web-app-springtoolsuite

Commande de démarrage:
	ng serve  --proxy-config proxy.conf.json

	Fichier: proxy.conf.json

### faire un pom parent
cf. pom racine

### faire un pom Pour le front
cf. pom pour front
	
### Configuration du Back inclure les ressources du front

inclure de repertoire dist

editer le pom du back.

### Builder l'ensemble

mvn clean install

# BDD
## h2 in-memory
		https://dzone.com/articles/integrate-h2-database-in-your-spring-boot-applicat

## Exemple de Data init	avec @Controller
	https://o7planning.org/fr/11893/integration-de-spring-spring-jpa-et-h2-database

# Spring

## profile activation de composant ou autre
	https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html

		@Configuration
		@Profile("production")
		public class ProductionConfiguration {

			// ...

		}

		spring.profiles.active=dev,hsqldb

## Annotation
	### Cores
		https://www.baeldung.com/spring-core-annotations

	### Web
		https://www.baeldung.com/spring-mvc-annotations

	### Spring Boot
		https://www.baeldung.com/spring-boot-annotations

	### Security Basic Auth
		Exemple
		https://www.baeldung.com/spring-boot-security-autoconfiguration

		Get User info
		https://www.baeldung.com/get-user-in-spring-security

## ANNEXES
git creation tag
git tag -a v1.1 -m "version avec packaging"
git push origin v1.1

.gitignore
cf. https://fr.atlassian.com/git/tutorials/saving-changes/gitignore

# Gestion des logs
https://www.mkyong.com/spring-boot/spring-boot-slf4j-logging-example/
https://www.mkyong.com/logging/logback-xml-example/

# Enregistrement
Microservice 
	avec admin decallage de port
Eureka
	https://o7planning.org/fr/11733/comprendre-spring-cloud-eureka-server-avec-un-exemple
Spring boot admin
	
	
