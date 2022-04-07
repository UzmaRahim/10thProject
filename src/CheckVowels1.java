import java.lang.*;
import java.io.*;
import java.util.*;

public class CheckVowels1 {
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
        String s1 = "Rb ar there ny words without vowels bcd";
        //String[] words = new String[50];
        List<String> words = new ArrayList<String>();

        String temp = "";
        int i = 0;
        int w = 0;
        int length = s1.length();
        for (i = 0; i < length; i++) {
            if (s1.charAt(i) != ' ')
                temp = temp + s1.charAt(i);
            else {
                words.add(temp);
                temp = "";
            }
        }
        words.add(temp);
        for (String a : words)
            if (checkNoVowel(a.toLowerCase())) System.out.println(a);


    }
}
