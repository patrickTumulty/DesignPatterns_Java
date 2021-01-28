package com.pt.facade;

/*
Obviously the below code wont run as it is. Everything is an interface, thus
no concrete classes. Nonetheless this illustrates the facade pattern. The
TheaterFacade interface is now an easy to use interface for this rather complex
API. We have abstracted the complex process of starting a movie into a single method.
This pattern provides a simplified API without removing functionality. For some API's
it may be necessary to have the complex API. The Facade we have created below doesn't
restrict the developer to ONLY using the Facade API.
 */


public class HomeTheaterFacade implements TheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             StreamingPlayer streamingPlayer,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = streamingPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    @Override
    public void watchMovie(String movie) {
        System.out.println("Get read to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setVolume(5);
        player.on();
        player.play(movie);

    }

    @Override
    public void endMovie() {
        System.out.println("Shutting down theater...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }

    @Override
    public void listToRadio() {

    }

    @Override
    public void endRadio() {

    }
}
