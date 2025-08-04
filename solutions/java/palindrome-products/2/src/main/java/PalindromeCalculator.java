import java.util.*;
import java.util.stream.LongStream;

class PalindromeCalculator {

    private boolean isPalindrome(long product){
        String productString = Long.toString(product);
        StringBuilder palindromeCheck = new StringBuilder(productString);
        return palindromeCheck.reverse().toString().equals(productString);
    }

    private void addPalidromeEntry(List<Integer> palindromeEntry, List<List<Integer>> palindromeFactorsList){
        palindromeEntry.sort(Integer::compareTo);
        if (!palindromeFactorsList.contains(palindromeEntry)){
            palindromeFactorsList.add(palindromeEntry);
        }
    }
    SortedMap<Long, List<List<Integer>>> getPalindromeProductsWithFactors(int minFactor, int maxFactor) {
        if(minFactor > maxFactor){
            throw new IllegalArgumentException("invalid input: min must be <= max");
        }
        SortedMap<Long, List<List<Integer>>> results = new TreeMap<>();
        long biggestPalindrome = Long.MIN_VALUE;
        List<List<Integer>> biggestPalindromeFactors =  new ArrayList<>();
        long smallestPalindrome = Long.MAX_VALUE;
        List<List<Integer>> smallestPalindromeFactors =  new ArrayList<>();
        for (int i = minFactor; i <= maxFactor; i++) {
            for (int j = minFactor; j <= maxFactor; j++) {
                long product = (long) i * j;
                if (isPalindrome(product)) {
                    if (product > biggestPalindrome) {
                        biggestPalindrome = product;
                        biggestPalindromeFactors = new ArrayList<>();
                        addPalidromeEntry(new ArrayList<>(List.of(i, j)), biggestPalindromeFactors);
                    } else if (product == biggestPalindrome) {
                        addPalidromeEntry(new ArrayList<>(List.of(i, j)), biggestPalindromeFactors);
                    }
                    if (product < smallestPalindrome) {
                        smallestPalindrome = product;
                        smallestPalindromeFactors = new ArrayList<>();
                        addPalidromeEntry(new ArrayList<>(List.of(i, j)), smallestPalindromeFactors);
                    } else if (product == smallestPalindrome) {
                        addPalidromeEntry(new ArrayList<>(List.of(i, j)), smallestPalindromeFactors);
                    }
                }
            }
        }
        if(!(smallestPalindrome == Long.MAX_VALUE || biggestPalindrome == Long.MIN_VALUE)){
            results.put(smallestPalindrome, smallestPalindromeFactors);
            results.put(biggestPalindrome, biggestPalindromeFactors);
        }

        return results;
    }

}