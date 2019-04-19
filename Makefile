JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) 

CLASSES = \
		/src/Barrier.java \
		/src/BarrierTest.java \
		/src/BThread.java

default: classes

classes: $(CLASSES: .java = .class)

clean:
	cp *.class bin/
	rm *.class