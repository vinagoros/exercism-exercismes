class ReverseString {
    /* CONSIDERING THIS AS CHEATING
    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        return sb.reverse().toString();
    }
*/
    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder(inputString.length());
        char[] charsInString = inputString.toCharArray();
        for (int i = charsInString.length - 1 ; i >= 0; i--) {
            sb.append(charsInString[i]);
        }
        return sb.toString();
    }
}

