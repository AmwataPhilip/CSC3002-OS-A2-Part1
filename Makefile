JFLAGS = -g
JC = javac
J = java
SOURCES = src/BarrierS/*.java
CLASSES = src/BarrierS/*.classes
.SUFFIXES: .java .class

default:
	$(JC) $(JFLAGS) $(SOURCES)

run:
	$(J) src/BarrierS/BarrierTest.class
clean:
	cp *.class ../bin
	rm $(CLASSES)