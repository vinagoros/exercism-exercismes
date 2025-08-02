import java.security.InvalidParameterException;

class CollatzCalculator {
    int stepCounter = 0;
    int computeStepCount(int start) {
        if(start <= 0){
            throw new InvalidParameterException("Only positive integers are allowed");
        }
        int result = 0;
        if (start > 1) {
            result = start % 2 == 0 ? start / 2 : 1 + start * 3;
            stepCounter ++;
            computeStepCount(result);
            }
            return stepCounter;
        }


}
