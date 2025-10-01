# Form Filling Application – Memento Pattern

## Overview
This project demonstrates the **Memento Design Pattern** in Java.  
The Memento Pattern allows capturing and restoring the state of an object without exposing its implementation details.  

In this project, we implement a **multi-step form** where the user can fill in details step by step. Users can **go back** to previous steps without losing data, simulating a real-world form filling scenario.

---

## Features
- Captures snapshots of form data at each step.  
- Supports undo functionality to go back to previous states.  
- Demonstrates Memento Pattern roles: **Originator, Memento, and Caretaker**.  
- Simple console-based simulation of multi-step form submission.  

---

## System Structure
- **Form (Originator):** Holds current form data and can save/restore state.  
- **FormState (Memento):** Stores a snapshot of the form’s state.  
- **FormHistory (Caretaker):** Manages the saved states and provides undo functionality.  
- **Main (Client):** Demonstrates filling the form, saving states, and undoing changes.  

---

## How to Run

1. **Ensure Java is installed** on your system.
2. **Navigate to project folder** in terminal:
```bash
