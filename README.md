# TP2 : Mise en œuvre de Jakarta XML Web Services

**Nom :** Masmoudi
**Prénom :** Ahmed

## Activité 1 : Configuration du projet Maven

Dans cette activité, nous avons créé un projet Maven dédié au développement d'un service web SOAP avec Jakarta XML Web Services (JAX-WS). Nous avons configuré le fichier `pom.xml` en ajoutant les dépendances nécessaires : `jakarta.xml.ws-api` pour les interfaces de JAX-WS, `jaxws-rt` pour l'implémentation et l'exécution du service web, et `jakarta.jws-api` pour les annotations. Enfin, nous avons créé deux packages, `service` et `serveur`, afin d'organiser le code du projet et de séparer l'implémentation du service de son lancement.
![](captures/3.png)
![](captures/4.png)

## Activité 2 : Création de la classe métier

Nous avons créé l'interface `ICalculatrice`, qui déclare les opérations disponibles, ainsi que la classe `CalculatriceWS` qui l'implémente. Pour cette première étape, nous avons choisi d'implémenter uniquement la méthode `addition()`, qui retourne la somme de deux entiers. Les autres méthodes seront ajoutées après avoir testé le bon fonctionnement de cette première opération.




![](captures/5.png)



![](captures/6.png)
