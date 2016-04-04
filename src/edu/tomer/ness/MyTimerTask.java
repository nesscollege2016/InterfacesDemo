package edu.tomer.ness;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private  int maxTimes;
    Timer timer;

    public MyTimerTask(Timer timer, int maxTimes) {
        this.maxTimes = maxTimes;
        this.timer = timer;
    }

    int counter = 0;
    @Override
    public void run() {
        if (counter < maxTimes) {
            System.out.println("Hello");
            counter++;
        }
        else timer.cancel();
    }
}
