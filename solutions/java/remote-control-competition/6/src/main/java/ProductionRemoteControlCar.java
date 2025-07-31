class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    protected int distance = 0;
    private int nrOfVictories = 0;
    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return nrOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        nrOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.nrOfVictories, this.nrOfVictories);
    }
}
