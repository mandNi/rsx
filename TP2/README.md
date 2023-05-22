# Rapport pour le TP2

## Auteur: 
1. NOM<sub>: MANDOUR</sub> Prénom<sub>: Nizar</sub>

## Exercice 2

Pour émettre et recevoir un paquet UDP multicast sur un réseau local, voici les étapes à suivre :

Créer une socket UDP.

Définir l'adresse et le port multicast à utiliser.

Joindre le groupe multicast pour pouvoir recevoir les paquets.

Utiliser la socket pour envoyer des données au groupe multicast.

Utiliser la socket pour recevoir des données en provenance du groupe multicast.

Pour chaque étape du programme d'émission et de réception, il est important de traiter les exceptions suivantes:

Les exceptions liées à la socket, comme la fermeture inattendue de la connexion ou une erreur
d'adresse.

Les exceptions liées à l'envoi et à la réception de données, comme un dépassement de la taille maximale 
autorisée pour un paquet ou une erreur de format des données.

Les exceptions liées à la gestion des groupes multicast, comme une erreur lors de l'inscription ou de la désinscription d'un groupe.

## Exercice 3 

Pour réaliser un client UDP capable d'émettre et de recevoir des paquets simultanément, nous pouvons utiliser 
les sockets en mode non bloquant. Cela nous permettra de recevoir et d'envoyer des paquets sans bloquer 
l'exécution du programme.

Pour pouvoir associer un nom symbolique à chaque machine, nous pouvons utiliser l'adresse IP de la machine comme identifiant unique. Nous pouvons également utiliser des en-têtes de message pour inclure des informations sur l'utilisateur, comme un nom d'utilisateur ou un identifiant d'utilisateur unique. De cette manière, chaque message sera associé au minimum à un nom de machine, et au mieux à un nom d'utilisateur, ce qui rendra plus facile la suivi des conversations.
