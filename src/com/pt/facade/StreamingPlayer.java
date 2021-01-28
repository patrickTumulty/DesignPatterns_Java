package com.pt.facade;

public interface StreamingPlayer {
    void on();
    void off();
    void pause();
    void play(String movie);
    void setSurroundAudio();
    void setTwoChannelAudio();
    void stop();
    String toString();
}
