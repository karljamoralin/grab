package com.example.grab;

public class State {

    public final static int STATE_BOOKING = 1;
    public final static int STATE_ALLOCATING = 2;

    private int state;
    private String data;

    public State(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
