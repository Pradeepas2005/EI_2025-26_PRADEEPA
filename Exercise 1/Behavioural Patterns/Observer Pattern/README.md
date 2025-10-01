# YouTube Subscription Project – Observer Pattern

## Use Case
This console-based application demonstrates the **Observer Design Pattern** in Java.  
The application simulates a **YouTube channel subscription system**, where subscribers are notified automatically whenever a new video is uploaded by a channel.

---

## Design Pattern
The application uses the **Observer Design Pattern**.  
This pattern establishes a **one-to-many relationship** between a subject and its observers. When the subject’s state changes, all registered observers are notified automatically.

---

## How it Relates to the Use Case
- **YouTubeChannel (Subject):** Maintains the list of subscribers and notifies them when a new video is uploaded.  
- **Subscriber (Observer):** Receives updates from the channel whenever a new video is uploaded.  
- **Observer (Interface):** Defines the `update()` method for all observers.  
- **Main (Client):** Demonstrates subscribing, unsubscribing, and notifying subscribers when videos are uploaded.

---

## Classes
- **Observer (Interface):** Defines `update(String message)` method for all subscribers.  
- **Subject (Interface):** Defines methods `subscribe()`, `unsubscribe()`, and `notifySubscribers()`.  
- **Subscriber:** Implements the Observer interface and prints notifications.  
- **YouTubeChannel:** Implements the Subject interface; manages subscribers and video uploads.  
- **Main:** Client class demonstrating subscribing, unsubscribing, and receiving video notifications.

---

## How to Run
1. **Navigate to the project folder**: `YouTubeSubscription`  
2. **Compile all the files**: javac *.java
3. **Run the MainClass**: java Main

---

## Sample output

<img width="1011" height="432" alt="image" src="https://github.com/user-attachments/assets/94d5677c-763f-41e0-8c23-5f8292472c10" />
