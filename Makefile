JFLAGS = -g
JC = javac
J = java
SOURCES = src/BarrierS/*.java
CLASSES = src/BarrierS/*.class
.SUFFIXES: .java .class

default:
	$(JC) $(JFLAGS) $(SOURCES)

run:
	cd src/
	$(J) BarrierS/BarrierTest
clean:
	rm $(CLASSES)