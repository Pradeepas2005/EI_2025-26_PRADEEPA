public class Main {
    public static void main(String[] args) {
        RobotFactory factory = new RobotFactory();

        Robot robot1 = factory.createWeldingRobot("Default Welding Configuration");
        robot1.display();

        Robot robot2 = factory.createWeldingRobot("Customized Welding with Laser");
        robot2.display();

        Robot robot3 = factory.createAssemblyRobot("Default Assembly Configuration");
        robot3.display();

        Robot robot4 = factory.createAssemblyRobot("Assembly Robot with Extra Tools");
        robot4.display();
    }
}
