JFLAGS = -g
JC = javac
J = java
SOURCES = src/BarrierS/*.java
CLASSES = src/BarrierS/*.class
.SUFFIXES: .java .class

default:
	$(JC) $(JFLAGS) $(SOURCES)

run:
	$(J) bin/BarrierTest
clean:
	cp $(CLASSES) bin/BarrierS/
	rm $(CLASSES)