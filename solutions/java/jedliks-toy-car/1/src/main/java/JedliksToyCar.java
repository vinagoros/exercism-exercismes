public class JedliksToyCar {
    private int battery = 100;
    private int meters = 0;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters";
    }

    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + this.battery + "%";
        }
    }



    public void drive() {
        if (this.battery > 0){
            this.meters += 20;
            this.battery -= 1;
        }

    }
}
