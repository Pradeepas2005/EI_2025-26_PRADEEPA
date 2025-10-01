# Singleton Pattern Project – Printer Spooler

## Use Case
This console-based application demonstrates the **Singleton Design Pattern** in Java.  
The application simulates a **Printer Spooler**, ensuring that only one instance of the printer spooler exists and all document printing requests are handled through that single instance.

---

## Design Pattern
The application uses the **Singleton Design Pattern**.  
This pattern ensures that a class has only one instance and provides a **global point of access** to that instance.  

---

## How it Relates to the Use Case
- **PrinterSpooler (Singleton):** Ensures only one instance of the printer spooler exists and provides a method to print documents.  
- **Main (Client):** Demonstrates usage of the PrinterSpooler singleton and shows that all references point to the same object.

---

## Classes
- **PrinterSpooler:** Implements the singleton pattern with a thread-safe `getInstance()` method and a `printDocument()` method.  
- **Main:** Client class that simulates printing multiple documents using the PrinterSpooler singleton.

---

## How to Run
1. **Navigate to the project folder**: `PrinterSpooler`  
2. **Compile all the files**:    javac *.java
3.  **Run the Main class**:      java Main

---


## Output

<img width="402" height="103" alt="image" src="https://github.com/user-attachments/assets/ac53c335-f082-4d69-b122-153cfe167b96" />
