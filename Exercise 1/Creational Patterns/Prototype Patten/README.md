# Robot Factory Project – Prototype Pattern

## Use Case
This console-based application demonstrates the **Prototype Design Pattern** in Java.  
The application simulates a **Robot Factory**, where robots like WeldingRobot and AssemblyRobot are created by cloning existing prototypes. Users can customize cloned robots with different configurations.

---

## Design Pattern
The application uses the **Prototype Design Pattern**.  
This pattern allows creating new objects by **cloning existing prototypes** instead of building them from scratch, which is useful when object creation is resource-intensive or complex.

---

## How it Relates to the Use Case
- **Robot (Prototype Interface):** Defines `clone()`, `setConfiguration()`, and `display()` methods for robot prototypes.  
- **WeldingRobot & AssemblyRobot (Concrete Prototypes):** Provide specific implementations for different types of robots.  
- **RobotFactory (Client / Factory):** Creates robots by cloning the prototypes based on user input.  
- **Main (Client):** Demonstrates cloning robots, customizing configurations, and showing that cloned robots are independent instances.

---

## Classes
- **Robot:** Interface defining cloning and configuration methods.  
- **WeldingRobot:** Concrete prototype for welding tasks.  
- **AssemblyRobot:** Concrete prototype for assembly tasks.  
- **RobotFactory:** Factory class to clone and return robot instances.  
- **Main:** Client class demonstrating the Prototype pattern.

---

## How to Run
1. **Navigate to the project folder**: `RobotFactory`  
2. **Compile all the files**:    javac *.java
3.  **Run the Main class**:      java Main

---


## Output

<img width="749" height="102" alt="image" src="https://github.com/user-attachments/assets/969496e3-c4d2-4c43-b84e-ac569a41035a" />
