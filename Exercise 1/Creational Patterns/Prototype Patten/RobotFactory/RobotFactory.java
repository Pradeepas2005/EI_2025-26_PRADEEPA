public class RobotFactory {
    private Robot weldingPrototype;
    private Robot assemblyPrototype;

    public RobotFactory() {
        weldingPrototype = new WeldingRobot();
        assemblyPrototype = new AssemblyRobot();
    }

    public Robot createWeldingRobot(String configuration) {
        Robot robot = weldingPrototype.clone();
        robot.setConfiguration(configuration);
        return robot;
    }

    public Robot createAssemblyRobot(String configuration) {
        Robot robot = assemblyPrototype.clone();
        robot.setConfiguration(configuration);
        return robot;
    }
}
