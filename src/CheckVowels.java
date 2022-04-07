import java.lang.*;
import java.util.*;
import java.io.*;

public class CheckVowels {
    static boolean checkNoVowel(String s) {
        int i;
        int length = s.length();
        for (i = 0; i < length; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                return (false);
        }
        return (true);
    }

    public static void main(String[] args) {
        String s1 = "Rb are there ny words without vowels. cnt fnd ny";
        String words[] = s1.split(" ");
        for (String a : words)
            if (checkNoVowel(a.toLowerCase())) System.out.println(a);


    }
}
