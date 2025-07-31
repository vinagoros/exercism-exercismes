class NeedForSpeed {
    private int speed;
    private int battery = 100;
    private int batteryDrain ;
    private int distanceRan = 0;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceRan;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distanceRan += speed;
            this.battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int trackDistance;
    RaceTrack(int distance) {
        this.trackDistance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (car.distanceDriven() < trackDistance){
            if (!car.batteryDrained()){
                car.drive();
            }
            else {
                break;
            }
        }
        boolean ableToFinish = car.distanceDriven() >= trackDistance;
        return ableToFinish;
    }
}
