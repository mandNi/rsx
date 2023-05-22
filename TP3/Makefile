all : exo1

exo1 : 
	javac -sourcepath exercice1 -d classes exercice1/*.java 

runExo1 : exo1
	java -classpath classes Server

runClient : exo1
	java -classpath classes Client

exo2 :
	javac -sourcepath excercice2 -d classes excercice2/ChatServer.java

runExo2Server : exo2
	java -classpath classes excercice2.ChatServer


clean :
	rm -r classes 

