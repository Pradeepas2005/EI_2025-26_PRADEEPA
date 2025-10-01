# Form Filling Application – Memento Pattern

## Use Case
This console-based application simulates a **multi-step form** where users fill in details step by step. Users can **save their progress** and go back to previous steps without losing already entered data, mimicking real-world web form scenarios like multi-step registration or checkout forms.

---

## Design Pattern
The application uses the **Memento Design Pattern**.  
This pattern captures and restores the internal state of an object without exposing its implementation details, enabling undo functionality.

---

## How it Relates to the Use Case
- **Originator (Form):** Holds the current form data and can save/restore state.  
- **Memento (FormState):** Stores a snapshot of the form’s state at a specific point.  
- **Caretaker (FormHistory):** Manages saved states and allows undoing steps.  
- **Client (Main):** Simulates the user filling the form and navigating between steps.

---

## Classes
- **Form (Originator):** Maintains the current form data and creates/restores snapshots.  
- **FormState (Memento):** Stores a snapshot of the form’s state.  
- **FormHistory (Caretaker):** Maintains a stack of saved states to allow undo operations.  
- **Main (Client):** Demonstrates the process of filling the form, saving states, and undoing changes.

---

## How to Run
1. **Navigate to the project folder**: `FormFilling`  
2. **Compile all the files**:    javac *.java
3.  **Run the Main class**:      java Main

---


## Output

### Filling form
<img width="500" height="220" alt="image" src="https://github.com/user-attachments/assets/19030fa1-c2bc-4058-8b79-9b2c7a5369b6" />


### Undone
<img width="500" height="167" alt="image" src="https://github.com/user-attachments/assets/eb2109e6-0b5e-4819-bfa1-8171b6315e6b" />


### Undone
<img width="500" height="182" alt="image" src="https://github.com/user-attachments/assets/d1b8d2da-d824-43e2-8d19-813688b26fa3" />




