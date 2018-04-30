package com.example.grab;

public interface BookingContract {

    interface View {
        void gotoAllocationScreen();
    }

    interface Presenter {
        void start();
        void stop();
    }

}
