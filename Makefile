JC = javac
JAVA = java
TARGETS = bin/Barrier.class
SOURCES = src/Barrier.java

$(TARGETS): $(SOURCES)
	$(JAVAC) $(SOURCES)

run:
	$(JAVA) $(TARGETS)