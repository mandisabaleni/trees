# binary search program makefile
# mands/guy
# 27 March 2017

JAVAC=/usr/bin/javac

SRCDIR=src
BINDIR=bin

b = Joe

SOURCES=$(shell find $(SRCDIR) -type f -name '*.java')
CLASSES=$(SOURCES:$(SRCDIR)/%.java=$(BINDIR)/%.class)

CP=src


default: compile

app:	java BSTApp 

search:  
	java -cp bin DamBSTApp "Pella Dam"
	java -cp bin DamBSTApp "Ngotwane Dam"
	java -cp bin DamBSTApp "Mokolo Dam"
	java -cp bin DamBSTApp "Unknown Dam"
	java -cp bin DamAVLApp "Pella Dam"
	java -cp bin DamAVLApp "Ngotwane Dam"
	java -cp bin DamAVLApp "Mokolo Dam"
	java -cp bin DamAVLApp "Unknown Dam"


compile: $(CLASSES)

.PHONEY: default compile

run-%: $(CLASSES)
	java -cp $(BINDIR) $*

$(BINDIR)/%.class: $(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR) -cp $(CP) $<

clean:
	rm  $(BINDIR)/*.class
