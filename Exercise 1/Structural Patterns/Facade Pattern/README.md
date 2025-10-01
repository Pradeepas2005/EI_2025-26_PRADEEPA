# Home Theater Project – Facade Pattern

## Use Case
This console-based application demonstrates the **Facade Design Pattern** in Java.  
The application simulates a **Smart Home Theater System**, where multiple devices such as Lights, Projector, Screen, and Speakers can be controlled through a single simplified interface.

---

## Design Pattern
The application uses the **Facade Design Pattern**.  
This pattern provides a **simplified interface** to a complex subsystem, making client interaction easier and hiding the complexity of individual components.

---

## How it Relates to the Use Case
- **Lights, Projector, Screen, Speakers (Subsystems):** Each represents a separate device in the home theater system.  
- **HomeTheaterFacade (Facade):** Provides a single interface to control all devices (start or end a movie).  
- **Main (Client):** Demonstrates starting and stopping the home theater using the facade, showing how multiple subsystems can be controlled easily.

---

## Classes
- **Lights:** Subsystem representing home lights.  
- **Projector:** Subsystem representing the projector.  
- **Screen:** Subsystem representing the projector screen.  
- **Speakers:** Subsystem representing the audio system.  
- **HomeTheaterFacade:** Facade class providing a simple interface to control all devices.  
- **Main:** Client class demonstrating the Facade pattern.

---

## How to Run
1. **Navigate to the project folder**: `Home Theater System`  
2. **Compile all the files**:    javac *.java
3.  **Run the Main class**:      java Main

---

## Output

<img width="435" height="353" alt="image" src="https://github.com/user-attachments/assets/d3ac0f29-b9b0-4ce1-8ab8-0403d1d50cfb" />

