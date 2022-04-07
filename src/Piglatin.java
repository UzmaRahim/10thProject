public class Piglatin {
    public static void main(String[] args) {
        String s1 = "TROUBLE";
        System.out.println(convert_Topig(s1.toUpperCase()));

    }

    static String convert_Topig(String s) {
        String s2 = "", s4 = "";
        String s3 = "AY";
        int i;
        int flag = -1;
        int length = s.length();
        for (i = 0; i < length; i++) {
          //  System.out.println(flag);
           // System.out.println(s.charAt(i));

            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                flag = i;
                break;
            } else
                s2 = s2 + s.charAt(i);

        }
        //System.out.println(flag);
        //System.out.println(s2);

        if (flag == -1) return s;
        for (i = flag; i < length; i++) {
            s4 = s4 + s.charAt(i);
        }
        //System.out.println(s4);
        //System.out.println(s2);
        //System.out.println(s3);


        String s1 = s4 + s2 + s3;
        return s1;

    }
}

