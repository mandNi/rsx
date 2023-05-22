all : exo1 exo2 exo3	

exo1 :
	javac -sourcepath excercice1 -d classes excercice1/*.java

exo2 :
	javac -sourcepath excercice2 -d classes excercice2/*.java 

exo3 :
	javac -sourcepath excercice3 -d classes excercice3/*.java 

runExo3 : exo3
	java -classpath classes excercice3.ChatApp
clean : 
	rm -r classes 
		
