package com.pt.facade;

public interface Tuner {
    void on();
    void off();
    void setAM();
    void setFM();
    void setFrequency(double frequency);
    String toString();
}
