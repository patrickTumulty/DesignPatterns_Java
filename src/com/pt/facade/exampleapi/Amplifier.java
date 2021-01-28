package com.pt.facade.exampleapi;

public interface Amplifier {
    void on();
    void off();
    void setStreamingPlayer(StreamingPlayer player);
    void setTuner(Tuner tuner);
    void setStereoSound();
    void setSurroundSound();
    void setVolume(int vol);
    String toString();
}
