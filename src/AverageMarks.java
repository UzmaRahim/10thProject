import java.lang.*;
import java.util.*;
import java.io.*;

public class AverageMarks {
    public static void main(String[] args) {
        int Roll[] = new int [50];
        float MarksA[] =new float[50];
        float MarksB[]= new float[50];
        float MarksC[] = new float[50];
        float Average[] = new float[50];
        int i;
        for (i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Roll");
            Roll[i] = sc.nextInt();
            System.out.println("Enter MarksA");
            MarksA[i] = sc.nextFloat();
            System.out.println("Enter MarksB");
            MarksB[i] = sc.nextFloat();
            System.out.println("Enter MarksC");
            MarksC[i] = sc.nextFloat();
            Average[i] = (MarksA[i] + MarksB[i] + MarksC[i]) / 3;

        }
        System.out.println("Average marks of each student");
        for (i = 0; i < 5; i++) {
        System.out.println(Roll[i]+" "+Average[i]);
        }
        System.out.println("Average marks >80");
        for (i = 0; i < 5; i++) {
            if(Average[i] >80)
            System.out.println(Roll[i]+" "+Average[i]);
        }
        System.out.println("Average marks <40");
        for (i = 0; i < 5; i++) {
            if(Average[i] <40)
            System.out.println(Roll[i]+" "+Average[i]);
        }
    }

        }
