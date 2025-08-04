class ReverseString {
    /* CONSIDERING THIS AS CHEATING
    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        return sb.reverse().toString();
    }
*/
    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder(inputString.length());
        for (int i = inputString.length() - 1 ; i >= 0; i--) {
            sb.append(inputString.charAt(i));
        }
        return sb.toString();
    }
}

