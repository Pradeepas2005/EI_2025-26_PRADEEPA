public class WeldingRobot implements Robot {
    private String configuration;

    public WeldingRobot() {
        this.configuration = "Default Welding Configuration";
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
        System.out.println("Welding Robot Configuration: " + configuration);
    }
}
