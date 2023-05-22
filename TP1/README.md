# Rapport pour le TP1

# Nizar MANDOUR

## 4)

bind 3 192.168.5.64 3000

## 5)

sendto 3 192.168.5.63 3000

## 6)

Mon voisin doit me fournir son adresse ip et le numéro de port

## 7)

recvfrom 3000 10

## 9)

close 3

## 10)

socket udp
socket udp

bind 3 * 0
bind 4 * 0


## 15-b)

Message : "Comment allez-vous ?" 
Adresse IP src : 127.0.0.1
Port UDP src : 53090 
Adresse IP dst : 127.0.0.1
Port UDP dst : 49212 

Message : "Tres bien.Merci !"
Adresse IP src : 127.0.0.1
Port UDP src : 49212
Adresse IP dst : 127.0.0.1
Port UDP dst : 53090


## 15-d)

D'apres le diagramme, la taille du message envoyé est de 20 octets, alors que la ligne frame indique 62 bytes d'envoyés, l'éfficacité est alors à : 31.25%


## TCP 

# Q1)

Nous constatons que la connection a été refusée.


# Q6)

Dans cet excercice, le socket 4 est en écoute. 

Le socket est donc le server et le socket 3 est le client.

# Q7)

Nous constatons sur wireshark que la connection a été établie.

# Q9)

La commande status nous permet de voir qu'un socket avec l'id 5 a été crée.

# Q10) 

Pour envoyer le message, nous avons utiliser cette commande :

write 3 "Command allez-vous ?"

# Q11b )

Le numéro de séquence du segment envoyé dans un protocole TCP correspond au numéro du premier octet de données contenu dans le segment. Ce numéro de séquence est utilisé pour ordonner les segments envoyés au sein d'une session TCP et pour permettre au destinataire de reconstituer les données dans le bon ordre. Le numéro de séquence peut également être utilisé pour détecter et corriger les erreurs de transmission.

# Q11 c) 

Le numéro d'acquittement d'un segment reçu dans un protocole TCP correspond au numéro du prochain octet de données attendu par le destinataire. Ce numéro d'acquittement est envoyé dans le segment suivant par le destinataire au lieu d'envoyer un acquittement explicite pour chaque segment reçu. Le numéro d'acquittement permet au système d'émission de savoir quels segments ont été correctement reçus et quels segments doivent être retransmis en cas d'erreur de transmission.

# Q11d)

Nous pouvons voir sur wireshark que le numéro d'acquitement est bien 21 ainsi que le numéro de séquence (1). La différence entre ces deux numéros correspond à la taille de notre message => 20


# Q13)

Afin de lire le message reçu, nous utilisons la commande suivante :

read 5 20

La commande accept nous renvoie le socket sur lequel nous lisons les données.













