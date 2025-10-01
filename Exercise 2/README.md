Satellite Command System
Use Case Overview

The Satellite Command System is a console-based application that simulates controlling a satellite in orbit. It allows users to send commands to the satellite to manage its orientation, solar panel status, and data collection. The system ensures sequential execution of commands while maintaining the satellite's state accurately.

Functionalities

Rotate Satellite: Change the satellite's orientation (North, South, East, West).

Activate/Deactivate Solar Panels: Turn solar panels on or off to control energy availability.

Collect Data: Gather data from the satellite, which can only be done when solar panels are active.

Check Status: View the current orientation, solar panel status, and total data collected.

Command Execution: Execute a series of commands through a command-line interface.

🧩 Design Patterns Used

Command Pattern

Purpose: Encapsulates requests as objects, allowing them to be executed, queued, or logged independently of the client that invokes them.

Relation to Use Case: Each satellite action (rotate, activate panels, deactivate panels, collect data) is encapsulated as a command object.

Classes Involved:

Command (interface)

RotateCommand, ActivatePanelsCommand, DeactivatePanelsCommand, CollectDataCommand

CommandExecutor (Invoker)

Singleton Pattern

Purpose: Ensures only one instance of the satellite exists.

Relation to Use Case: Guarantees that all commands operate on the same satellite instance.

Classes Involved:

Satellite

Factory Method Pattern

Purpose: Dynamically creates command objects based on user input.

Relation to Use Case: Simplifies the creation of commands like rotate, activate, deactivate, and collect.

Classes Involved:

CommandFactory

🗂️ Classes and Their Responsibilities

Satellite.java: Singleton class representing the satellite. Manages orientation, solar panels, and data collection.

Command.java: Interface for command execution.

RotateCommand.java: Concrete command to rotate the satellite in a given direction.

ActivatePanelsCommand.java: Concrete command to activate solar panels.

DeactivatePanelsCommand.java: Concrete command to deactivate solar panels.

CollectDataCommand.java: Concrete command to collect data from the satellite.

CommandExecutor.java: Invoker class that executes commands and handles exceptions.

CommandFactory.java: Factory class to create commands based on user input.

SatelliteCLI.java: Entry point for user interaction, providing a command-line interface to issue commands.

🛠️ Compiling and Executing

To compile the Java source files, navigate to the src directory and use the following command:

javac -d ../out com/satellite/*.java


To run the application, use the following command:

java -cp ../out com.satellite.SatelliteCLI

🛠️ Tech Stack

Programming Language: Java – for object-oriented design, maintainability, and use of design patterns.

JDK Version: JDK 17 – provides a stable environment with the latest features.

Build and Execution:

javac – Compiles source code

java – Runs the compiled bytecode

Version Control: Git – for tracking changes and code management.

📞 Contact Information

Gmail: pradeepas@example.com

GitHub: YourGitHubUsername