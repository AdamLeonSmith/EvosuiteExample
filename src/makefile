all: build

clean:
	rm -f *.class *.jar

compile:
	javac *.java

build: compile
	jar cvfm Calculator.jar manifest.in *.class