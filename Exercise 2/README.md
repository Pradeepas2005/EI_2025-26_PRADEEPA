# Satellite Command System

## Use Case
This console-based application simulates controlling a **satellite in orbit**.  
Users can send commands to manage the satellite's orientation, solar panel status, and data collection.  
The system ensures sequential execution of commands while maintaining the satellite's state accurately.

---

## Functionalities
- **Rotate Satellite:** Change orientation (North, South, East, West)  
- **Activate/Deactivate Solar Panels:** Control energy availability  
- **Collect Data:** Gather data from the satellite (requires solar panels to be active)  
- **Check Status:** View orientation, solar panel status, and total data collected  
- **Command Execution:** Execute a series of commands via a command-line interface  

---

## Design Patterns Used

### Command Pattern
- **Purpose:** Encapsulates requests as objects, allowing them to be executed, queued, or logged independently of the client.  
- **Relation to Use Case:** Each satellite action (rotate, activate panels, deactivate panels, collect data) is a command object.  
- **Classes Involved:** `Command` (interface), `RotateCommand`, `ActivatePanelsCommand`, `DeactivatePanelsCommand`, `CollectDataCommand`, `CommandExecutor` (Invoker)

### Singleton Pattern
- **Purpose:** Ensures only one instance of the satellite exists.  
- **Relation to Use Case:** Guarantees all commands operate on the same satellite instance.  
- **Classes Involved:** `Satellite`

### Factory Method Pattern
- **Purpose:** Dynamically creates command objects based on user input.  
- **Relation to Use Case:** Simplifies creation of commands like rotate, activate, deactivate, and collect.  
- **Classes Involved:** `CommandFactory`

---

## Classes and Their Responsibilities
- **Satellite.java:** Singleton class representing the satellite; manages orientation, solar panels, and data collection  
- **Command.java:** Interface for command execution  
- **RotateCommand.java:** Rotates the satellite in a given direction  
- **ActivatePanelsCommand.java:** Activates solar panels  
- **DeactivatePanelsCommand.java:** Deactivates solar panels  
- **CollectDataCommand.java:** Collects data from the satellite  
- **CommandExecutor.java:** Invoker that executes commands and handles exceptions  
- **CommandFactory.java:** Factory class that creates commands based on user input  
- **SatelliteCLI.java:** Entry point for user interaction; provides command-line interface  

---

## How to Run
1. **Navigate to the project folder**: `src\com\Satellite`  
2. **Compile all the files**:   javac *.java
3.  **Run the Main class**: java SatelliteCLI

---

## Output

### Orientation rotate(West) would set the orientation to "West"

<img width="700" height="103" alt="image" src="https://github.com/user-attachments/assets/926a67af-7f47-4c2c-a2ac-6a09808c8449" />


### Activate Panels

<img width="700" height="103" alt="image" src="https://github.com/user-attachments/assets/1b7b8065-c5a1-4d86-96e0-04ad8e15fb1a" />


### Deactivate Panels

<img width="700" height="103" alt="image" src="https://github.com/user-attachments/assets/a39659b3-aea2-4635-aa97-2d5920b7b73a" />


### Collect Data

while panels are active

<img width="700" height="103" alt="image" src="https://github.com/user-attachments/assets/20233bb9-cbb9-43ab-b129-0e32b67b749e" />

while panels are inactive->cannot collect when panels are inactive

<img width="700" height="103" alt="image" src="https://github.com/user-attachments/assets/31d651ed-d474-4d60-b5cc-b9ae207be79f" />


### Status is used to display details about orientation,panels(active/inactive) and collected data

<img width="700" height="103" alt="image" src="https://github.com/user-attachments/assets/1655eaa4-e0c7-485b-b396-d63d57cdfd3a" />


### Exit

<img width="700" height="103" alt="image" src="https://github.com/user-attachments/assets/31a518d2-e317-453a-b9d6-5c628da6f99e" />



## Contact :
For any questions or suggestions, please contact me at [pradeeparathika@gmail.com].
