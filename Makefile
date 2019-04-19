JFLAGS = -g
JC = javac
J = java
SOURCES = BarrierS/*.java
CLASSES = BarrierS/*.class
.SUFFIXES: .java .class

default:
	$(JC) $(JFLAGS) $(SOURCES)

run:
	$(J) BarrierS/BarrierTest 5 5
clean:
	rm $(CLASSES)