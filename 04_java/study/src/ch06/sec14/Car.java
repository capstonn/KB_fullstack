package ch06.sec14;

public class Car {

    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed<0) {
            this.speed = 0;

        }
    }

    public Car() {
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
