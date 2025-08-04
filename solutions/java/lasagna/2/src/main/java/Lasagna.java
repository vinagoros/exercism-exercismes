public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    }
    public int preparationTimeInMinutes(int nrOfLayers){
        return 2*nrOfLayers;
    }
    public int totalTimeInMinutes(int nrOfLayers, int minutesInOven){
        return preparationTimeInMinutes(nrOfLayers) + minutesInOven;
    }
}
