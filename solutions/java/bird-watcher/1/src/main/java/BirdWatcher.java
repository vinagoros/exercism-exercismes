
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int lastElementIndex = this.birdsPerDay.length - 1;
        return this.birdsPerDay[lastElementIndex];
    }

    public void incrementTodaysCount() {
        int lastElementIndex = this.birdsPerDay.length - 1;
        this.birdsPerDay[lastElementIndex] ++ ;
    }

    public boolean hasDayWithoutBirds() {
        for (int dayBirdCount:
             this.birdsPerDay) {
            if (dayBirdCount < 1) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int nrOfDaysToCount = numberOfDays;
        if(numberOfDays > this.birdsPerDay.length){
            nrOfDaysToCount = this.birdsPerDay.length;
        }
        int totalBirdCount = 0;
        for (int i = 0; i < nrOfDaysToCount; i++) {
            totalBirdCount += this.birdsPerDay[i];
        }
        return totalBirdCount;
    }

    public int getBusyDays() {
        int nrOfBusyDays = 0;
        for (int dailyBirdNumber:
                this.birdsPerDay) {
            if (dailyBirdNumber >= 5) {
                nrOfBusyDays ++;
            }
        }
        return nrOfBusyDays;
    }
}
