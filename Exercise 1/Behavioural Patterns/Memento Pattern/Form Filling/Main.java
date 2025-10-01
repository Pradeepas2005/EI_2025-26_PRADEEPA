public class Main {
    public static void main(String[] args) {
        Form form = new Form();
        FormHistory history = new FormHistory();

        form.setName("Alice");
        history.push(form.save());

        form.setEmail("alice@example.com");
        history.push(form.save());

        form.setAddress("123 Main Street");
        form.printForm();

        form.restore(history.pop());
        System.out.println("\nAfter Undo Last Step:");
        form.printForm();

        form.restore(history.pop());
        System.out.println("\nAfter Undo Second Step:");
        form.printForm();
    }
}
