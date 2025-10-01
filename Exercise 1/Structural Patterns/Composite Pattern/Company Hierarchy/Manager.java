import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private int id;
    private List<Employee> subordinates = new ArrayList<Employee>();

    public Manager(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager [ID: " + id + "]: " + name);
        for (Employee e : subordinates) {
            e.showDetails();
        }
    }
}
