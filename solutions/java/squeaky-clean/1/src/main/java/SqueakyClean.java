import java.lang.Character;
import java.util.Arrays;
import java.util.List;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleanStringBuilder = new StringBuilder();

        String leetSpeakChars = "43017";

        char[] leetSpeakTranslate = {'a', 'e', 'o', 'l', 't'};

        char[] identifierCharArr = identifier.toCharArray();
        int arrLength = identifierCharArr.length;
        for (int i = 0; i < arrLength; i++) {
            char character = identifierCharArr[i];
            char cleanCharacter = ' ';
            if (!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))) {
                if (leetSpeakChars.indexOf(character) != -1) {
                    int leetCharIdx = leetSpeakChars.indexOf(character);
                    cleanCharacter = leetSpeakTranslate[leetCharIdx];
                }
                else {
                switch (character) {
                    case ' ' -> cleanCharacter = '_';
                    case '-' -> {
                        if (i != arrLength - 1) {
                            cleanCharacter = Character.toUpperCase(identifierCharArr[i + 1]);
                            i++;
                        } else {
                            cleanCharacter = character;
                        }
                    }
                    default -> {
                        continue;
                    }
                }
            }
            }
            else {
                cleanCharacter = character;
            }
            cleanStringBuilder.append(cleanCharacter);
        }
            return cleanStringBuilder.toString();
        }
    }
