package com.example.grab;

public class BookingPresenter implements BookingContract.Presenter {

    BookingContract.View view;
    StateRepository stateRepository;
    int sleepInterval = 5000;

    State state;

    public BookingPresenter(BookingContract.View view) {
        this.view = view;
    }

    public State getState() {
        return state;
    }

    @Override
    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.interrupted()) {
                    state = stateRepository.getState();

                    if (state.getState() == State.STATE_ALLOCATING ) {
                        view.gotoAllocationScreen();
                    }

                    try {
                        Thread.sleep(sleepInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    public void stop() {

    }
}
