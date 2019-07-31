package fr.codes;

public class UnicodeAndChars {
    public static void main(String[] args) {
        char[] chars = {'*', '9', 'W'};
        for (int i = 0; i < chars.length; i++){
            System.out.println("Unicode de " + chars[i] + " est : " + (int) chars[i]);
        }

        int[] codes = {34, 65, 123};
        for (int i = 0; i < codes.length; i++){
            System.out.println("Caractère correspondant à " + codes[i] + " est : " + (char) codes[i]);
        }
    }
}
