import java.security.InvalidParameterException;

class CollatzCalculator {

    int computeStepCount(int start) {
        int stepCounter = 0;
        if(start <= 0){
            throw new InvalidParameterException("Only positive integers are allowed");
        }
        int result;
        if (start > 1) {
            result = start % 2 == 0 ? start / 2 : 1 + start * 3;
            stepCounter ++;
            computeStepCount(result);
            }
            return stepCounter;
        }


}
