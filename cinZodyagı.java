package patikadev;

import java.util.Scanner;

public class cinZodyagı {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        String burc = "";
        System.out.print("enter your birth year:");
        year = in.nextInt();

        switch (year % 12) {
            case 0:
                burc = "maymun";
                System.out.println("burcunuz:" + burc);
                break;

            case 1:
                burc = "horoz";
                System.out.println("burcunuz:" + burc);
                break;
            case 2:
                burc = "köpek";
                System.out.println("burcunuz:" + burc);
                break;
            case 3:
                burc = "domuz";
                System.out.println("burcunuz:" + burc);
                break;
            case 4:
                burc = "fare";
                System.out.println("burcunuz:" + burc);
                break;
            case 5:
                burc = "öküz";
                System.out.println("burcunuz:" + burc);
                break;
            case 6:
                burc = "kaplan";
                System.out.println("burcunuz:" + burc);
                break;
            case 7:
                burc = "tavşan";
                System.out.println("burcunuz:" + burc);
                break;
            case 8:
                burc = "ejderha";
                System.out.println("burcunuz:" + burc);
                break;
            case 9:
                burc = "yılan";
                System.out.println("burcunuz:" + burc);
                break;
            case 10:
                burc = "at";
                System.out.println("burcunuz:" + burc);
                break;
            case 11:
                burc = "koyun";
                System.out.println("burcunuz:" + burc);
                break;



        }
    }
}
