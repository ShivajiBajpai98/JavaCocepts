package com.atmecs.string;

class AlphanumericPalindromeValidator {
    public static boolean isValid(String value) {
        char[] chars = value.toCharArray();
        int i = 0;
        int j = value.length() - 1;
        while (i < j) {
            char character = chars[i];
            while (!AlphanumericPalindromeValidator.isAlphanumeric(character) && i < j) {
                i++;
                character = chars[i];
            }
            char oppositeCharacter = chars[j];
            while (!AlphanumericPalindromeValidator.isAlphanumeric(oppositeCharacter) && i < j) {
                j--;
                oppositeCharacter = chars[j];
            }

            if (i < j
                    && !(AlphanumericPalindromeValidator.isAlphabeticCharacterPair(character, oppositeCharacter)
                    && Character.toLowerCase(character) == Character.toLowerCase(oppositeCharacter))
                    && !(AlphanumericPalindromeValidator.isNumericCharacterPair(character, oppositeCharacter)
                    && character == oppositeCharacter)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static boolean isAlphanumeric(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }

    public static boolean isAlphabeticCharacterPair(char c1, char c2) {
        return Character.isAlphabetic(c1) && Character.isAlphabetic(c2);
    }

    public static boolean isNumericCharacterPair(char c1, char c2) {
        return Character.isDigit(c1) && Character.isDigit(c2);
    }

    public static void main(String[] args) {

    }
}
