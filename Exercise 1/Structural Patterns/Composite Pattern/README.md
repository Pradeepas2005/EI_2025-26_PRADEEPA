Company Hierarchy 
Overview

This project demonstrates the Composite Design Pattern in Java.
The Composite Pattern allows you to treat individual objects and compositions of objects uniformly, making it ideal for tree-like structures.

In this project, we implement a company hierarchy where employees have Name and ID and can be individual developers (Leaf) or managers with subordinates (Composite).

Features

Represents company hierarchy using the Composite pattern.

Each employee has a Name and ID.

Allows managers to have multiple subordinates, including other managers.

Demonstrates that both individual employees and managers can be treated uniformly.

Provides a clear tree-like display of the organization structure.

Structure

Employee: Interface defining showDetails() method.

Developer: Leaf class representing individual employees with ID and Name.

Manager: Composite class representing managers with subordinates.

Main: Client class that demonstrates creating and displaying the company hierarchy.

How to Run

Ensure you have Java installed on your machine.

Open terminal in the project folder (the src folder if following structure below).

Compile the Java files:

javac *.java


Run the Main class:

java Main