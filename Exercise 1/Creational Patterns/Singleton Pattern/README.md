**Singleton Pattern Project
Overview
**
This project demonstrates the Singleton Design Pattern in Java.
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

In this project, we implement a Printer Spooler as a real-world example of a Singleton.

Features

Ensures only one instance of PrinterSpooler is created.

Thread-safe access using synchronized getInstance() method.

Demonstrates usage with a main application that prints documents.

Shows that all references point to the same object.

Structure

PrinterSpooler: A class that follows the Singleton pattern to ensure only one instance of the printer spooler exists. It provides a printDocument method to print documents.

Main: A client class that demonstrates the use of the PrinterSpooler singleton.

How to Run

Ensure you have Java installed on your machine.

Open terminal in the project folder (src folder if following structure below).

Compile the Java files: javac *.java

Run the Main class: java Main
