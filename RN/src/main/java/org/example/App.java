package org.example;

import java.util.Scanner;

public class App {

    static int[] letterAmount = new int[7];

    static StringBuilder roman = new StringBuilder();
    static String roman2;

    static int num = 1;

    public static void main(String[] args) {
        while (num != 0) {
            System.out.println("\nEnter a number, 0 to exit");
            num = new Scanner(System.in).nextInt();

            generateLetterAmounts(letterAmount, num);
            appendLetters(letterAmount);
            replaceLetters();

            System.out.println(roman2);
            roman = new StringBuilder();
        }
    }

    public static void generateLetterAmounts(int[] letterAmount, int num) {
        if (num < 0)
            num = num * -1;
        letterAmount[0] = num / 1000;
        num -= letterAmount[0] * 1000;
        letterAmount[1] = num / 500;
        num -= letterAmount[1] * 500;
        letterAmount[2] = num / 100;
        num -= letterAmount[2] * 100;
        letterAmount[3] = num / 50;
        num -= letterAmount[3] * 50;
        letterAmount[4] = num / 10;
        num -= letterAmount[4] * 10;
        letterAmount[5] = num / 5;
        num -= letterAmount[5] * 5;
        letterAmount[6] = num;
    }

    public static void appendLetters(int[] letterAmount) {
        for (int i = 0; i < letterAmount[0]; i++)  {
            roman.append('M');
        }
        for (int i = 0; i < letterAmount[1]; i++)  {
            roman.append('D');
        }
        for (int i = 0; i < letterAmount[2]; i++)  {
            roman.append('C');
        }
        for (int i = 0; i < letterAmount[3]; i++)  {
            roman.append('L');
        }
        for (int i = 0; i < letterAmount[4]; i++)  {
            roman.append('X');
        }
        for (int i = 0; i < letterAmount[5]; i++)  {
            roman.append('V');
        }
        for (int i = 0; i < letterAmount[6]; i++)  {
            roman.append('I');
        }
    }

    public static void replaceLetters() {
        roman2 = roman.toString();
        roman2 = roman2.replace("DDDD", "DM");
        roman2 = roman2.replace("CCCC", "CD");
        roman2 = roman2.replace("LLLL", "LC");
        roman2 = roman2.replace("XXXX", "XL");
        roman2 = roman2.replace("VVVV", "VX");
        roman2 = roman2.replace("IIII", "IV");
        roman2 = roman2.replace("DCD", "CM");
        roman2 = roman2.replace("CLC", "LD");
        roman2 = roman2.replace("LXL", "XC");
        roman2 = roman2.replace("XVX", "VL");
        roman2 = roman2.replace("VIV", "IX");
    }

}
