public class AssemblyRobot implements Robot {
    private String configuration;

    public AssemblyRobot() {
        this.configuration = "Default Assembly Configuration";
    }

    @Override
    public Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    @Override
    public void display() {
        System.out.println("Assembly Robot Configuration: " + configuration);
    }
}
