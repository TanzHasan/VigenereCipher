.PHONY: run clean
ARGS=

run: Vigenere.class
	java Vigenere $(ARGS)

playfair.class:
	javac Vigenere.java

clean:
	rm *.class
