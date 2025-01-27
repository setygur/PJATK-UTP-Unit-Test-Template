package main;

public class BasicUtils {
    public static String reversed(String str) {
        if(str == null || str.length() == 0){
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static int vowelCount(String str) {
        long count = str.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .filter(BasicUtils::isVowel)
                .count();

        return (int) count;
    }

    public static boolean isVowel(char c) {
        return "aeio".contains(String.valueOf(c));
    }
}
