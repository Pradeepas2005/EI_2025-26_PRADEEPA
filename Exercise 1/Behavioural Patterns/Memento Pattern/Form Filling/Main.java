import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Form form = new Form();
        FormHistory history = new FormHistory();

        history.push(form.save());

        System.out.print("Enter Name: ");
        form.setName(scanner.nextLine());
        history.push(form.save());

        System.out.print("Enter Email: ");
        form.setEmail(scanner.nextLine());
        history.push(form.save());

        System.out.print("Enter Address: ");
        form.setAddress(scanner.nextLine());
        history.push(form.save());

        System.out.println("\n Filled Form ");
        form.printForm();

        while (true) {
            System.out.print("\nDo you want to undo the last step? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                history.pop();
                FormState previousState = history.pop();
                form.restore(previousState);
                history.push(form.save());
                System.out.println("\n--- Form After Undo ---");
                form.printForm();
            } else {
                break;
            }
        }

        System.out.println("\nFinal Form Data:");
        form.printForm();
        scanner.close();
    }
}
