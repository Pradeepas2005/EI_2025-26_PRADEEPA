public class Developer implements Employee {
    private String name;
    private int id;

    public Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer [ID: " + id + "]: " + name);
    }
}
