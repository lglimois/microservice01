# Introduction

Projet pour tester les microservices

## Appel Service REST depuis le back
cf. https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-resttemplate.html

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
