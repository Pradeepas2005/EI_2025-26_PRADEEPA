public interface Robot extends Cloneable {
    Robot clone();

    void setConfiguration(String configuration);

    void display();
}
