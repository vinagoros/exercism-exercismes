import java.util.List;

public class CarsAssemble {
    protected final Integer[] SPEEDRATES = {4,8,9,10};
    protected final double[] SUCCESSRATES = {1,0.9,0.8,0.77};

    public double averageSuccessRate(int speed) {
        double successRate = 1;
        for (int i = 0; i < SPEEDRATES.length; i++) {
            if (speed <= SPEEDRATES[i] && speed > 0) {
                successRate = SUCCESSRATES[i];
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
