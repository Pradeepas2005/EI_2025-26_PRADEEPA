# Company Hierarchy Project – Composite Pattern

## Use Case
This console-based application demonstrates the **Composite Design Pattern** in Java.  
The application simulates a **company hierarchy**, where employees can be individual developers or managers with subordinates. Users can view the organization structure as a tree-like hierarchy.

---

## Design Pattern
The application uses the **Composite Design Pattern**.  
This pattern allows treating **individual objects (Leaf)** and **compositions of objects (Composite)** uniformly, which is ideal for representing tree-like structures such as company hierarchies.

---

## How it Relates to the Use Case
- **Employee (Component):** Interface defining `showDetails()` method for all employees.  
- **Developer (Leaf):** Represents individual employees with Name and ID.  
- **Manager (Composite):** Represents managers who can have multiple subordinates, including other managers.  
- **Main (Client):** Demonstrates creating employees, adding them to managers, and displaying the hierarchy.

---

## Classes
- **Employee:** Interface with `showDetails()` method.  
- **Developer:** Leaf class representing an individual employee.  
- **Manager:** Composite class representing a manager with subordinates.  
- **Main:** Client class demonstrating the Composite pattern with a company hierarchy.

---

## How to Run
1. **Navigate to the project folder**: `CompanyHierarchy`  
2. **Compile all the files**:    javac *.java
3.  **Run the Main class**:     java Main

## Output

<img width="362" height="123" alt="image" src="https://github.com/user-attachments/assets/9d6d58a4-1186-4171-ae4b-da7fbc46a3ee" />


