package Assement2;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Online Survey System ");
        int count=0;
        int rating1=0, rating2=0, rating3=0, rating4=0, rating5=0;
        System.out.println("Enter Number Of the participatrs");
        int y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            System.out.println("Enter your name ");
            String n = sc.next();
            System.out.println("Please give me fedback YES OR NO");
            System.out.println(" 1. Do You enjoy our company culture");
            String s1 = sc.next();
            System.out.println(" 2. Do you connected to your teammates ");
            String s2 = sc.next();
            System.out.println(" 3. Do you feel that you contribute to the company's goals ");
            String s3 = sc.next();
            System.out.println(" 4. Do you feel valued");
            String s4 = sc.next();
            System.out.println(" 5. Do you feel there is opportunity to grow");
            String s5 = sc.next();
            System.out.println(" 6. Do you enjoy your day to tasks");
            String s6 = sc.next();
            System.out.println("Give me Rating Is out of 5 *");
            int rating = sc.nextInt();
            switch (rating) {
                case 1:
                    rating1++;
                    System.out.println("Giving 1 *" +rating1);
                    break;
                case 2:
                    rating++;
                    System.out.println("Giving 2* "+ rating2);

                    break;
                case 3:
                    rating3++;
                    System.out.println("Giving 3* "+rating3);

                    break;
                case 4:
                    rating4++;
                    System.out.println("Giving 4* is "+rating4);
                    break;
                case 5:
                    rating5++;
                    System.out.println("Giving 5* is "+rating5);
                    break;
            }

           count++;
            System.out.println("total persons "+count);
            System.out.println("Thankyou for Particpation ");
        }

    }
}


