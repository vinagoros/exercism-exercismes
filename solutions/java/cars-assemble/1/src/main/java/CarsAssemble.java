import java.util.List;

public class CarsAssemble {
    Integer[] SPEEDRATES = {4,8,9,10};
    double[] SUCCESSRATES = {1,0.9,0.8,0.77};

    public double averageSuccessRate(int speed) {
        double successRate = 1;
        for (int speedT : SPEEDRATES) {
            if (speed <= speedT && speed > 0) {
                int idx = List.of(SPEEDRATES).indexOf(speedT);
                successRate = SUCCESSRATES[idx];
                break;
            }
        }
        return successRate;
    }

    public double productionRatePerHour(int speed) {
        double successRate = averageSuccessRate(speed);
        return 221 * speed * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}
