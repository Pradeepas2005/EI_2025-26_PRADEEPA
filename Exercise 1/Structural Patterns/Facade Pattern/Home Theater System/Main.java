public class Main {
    public static void main(String[] args) {
        Lights lights = new Lights();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Speakers speakers = new Speakers();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(lights, projector, screen, speakers);

        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}
