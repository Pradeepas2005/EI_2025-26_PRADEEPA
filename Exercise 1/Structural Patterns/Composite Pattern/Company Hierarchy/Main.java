public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Alice", 1001);
        Developer dev2 = new Developer("Bob", 1002);

        Manager manager1 = new Manager("Charlie", 1003);
        manager1.add(dev1);
        manager1.add(dev2);

        Developer dev3 = new Developer("David", 1004);
        Manager generalManager = new Manager("Eve", 1005);
        generalManager.add(manager1);
        generalManager.add(dev3);

        // Display the whole hierarchy
        generalManager.showDetails();
    }
}
