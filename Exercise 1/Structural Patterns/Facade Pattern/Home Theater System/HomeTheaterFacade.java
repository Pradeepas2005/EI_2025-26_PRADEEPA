public class HomeTheaterFacade {
    private Lights lights;
    private Projector projector;
    private Screen screen;
    private Speakers speakers;

    public HomeTheaterFacade(Lights lights, Projector projector, Screen screen, Speakers speakers) {
        this.lights = lights;
        this.projector = projector;
        this.screen = screen;
        this.speakers = speakers;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        lights.dim(20);
        screen.down();
        projector.on();
        projector.setInput(movie);
        speakers.on();
        speakers.setVolume(50);
        System.out.println("Movie \"" + movie + "\" is ready to play!");
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        lights.on();
        screen.up();
        projector.off();
        speakers.off();
        System.out.println("Movie theater is now off.");
    }
}
