import java.util.*;
import java.util.stream.LongStream;

class PalindromeCalculator {


    /*first implementation

    private boolean isPalindrome(long product){
        String productString = Long.toString(product);
        StringBuilder palindromeCheck = new StringBuilder(productString);
        return palindromeCheck.reverse().toString().equals(productString);
    }
    */
    //second implementation - i used two arrays instead of checking ends of one array for the sake of code simplicity

    private boolean isPalindrome(long product){
        int productLength = product != 0 ? (int) Math.log10(product) +1 : 1 ;
        int[] digits = new int[productLength];
        int[] reversed = new int[productLength];
        for (int i = productLength - 1; i >= 0; i--) {
            int result = (int) (product % 10);
            digits[i] = result;
            reversed[productLength - 1 - i] = result;
            product = product / 10;
        }
        return Arrays.equals(digits, reversed);
    }

    /*after review, a method to add the palindromes is no longer needed
     as duplicate entries are no longer an issue with j starting at i

        private void addPalidromeEntry(List<Integer> palindromeEntry, List<List<Integer>> palindromeFactorsList){
        palindromeEntry.sort(Integer::compareTo);
        if (!palindromeFactorsList.contains(palindromeEntry)){
            palindromeFactorsList.add(palindromeEntry);
        }
    }
    */

    SortedMap<Long, List<List<Integer>>> getPalindromeProductsWithFactors(int minFactor, int maxFactor) {
        if(minFactor > maxFactor){
            throw new IllegalArgumentException("invalid input: min must be <= max");
        }
        SortedMap<Long, List<List<Integer>>> results = new TreeMap<>();

        long biggestPalindrome = Long.MIN_VALUE;
        List<List<Integer>> biggestPalindromeFactors =  new ArrayList<>();
        boolean foundSmallest = false, foundBiggest = false; //booleans to ease readibility

        long smallestPalindrome = Long.MAX_VALUE;
        List<List<Integer>> smallestPalindromeFactors =  new ArrayList<>();
        for (int i = minFactor; i <= maxFactor; i++) {
            for (int j = i; j <= maxFactor; j++) { // j starts at i to avoid duplicates and inneficient looping
                long product = (long) i * j;
                if (isPalindrome(product)) {
                    if (product > biggestPalindrome) {
                        foundBiggest = true;
                        biggestPalindrome = product;
                        biggestPalindromeFactors = new ArrayList<>();
                        biggestPalindromeFactors.add(List.of(i,j));
                    } else if (product == biggestPalindrome) {
                        biggestPalindromeFactors.add(List.of(i,j));
                    }
                    if (product < smallestPalindrome) {
                        foundSmallest = true;
                        smallestPalindrome = product;
                        smallestPalindromeFactors = new ArrayList<>();
                        smallestPalindromeFactors.add(List.of(i,j));
                    } else if (product == smallestPalindrome) {
                        smallestPalindromeFactors.add(List.of(i,j));
                    }
                }
            }
        }
        if(foundSmallest && foundBiggest){
            results.put(smallestPalindrome, smallestPalindromeFactors);
            results.put(biggestPalindrome, biggestPalindromeFactors);
        }

        return results;
    }

}