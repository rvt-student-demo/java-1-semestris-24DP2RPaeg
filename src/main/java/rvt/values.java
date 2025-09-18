package rvt;

import java.util.Scanner;

public class values {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);  
            System.out.println("Grade points[0-100]: ");
            int values = Integer.valueOf(scanner.nextLine());

            if (values < 0 ){
                System.out.println("Grade:Imposible!");
            } else if (values <= 49) {
                System.out.println("Grade:failed!");
            }else if (values <= 59) {
                System.out.println("Grade:1");
            } else if (values <= 69) {
                System.out.println("Grade:2");
            } else if (values <= 79) {
                System.out.println("Grade:3");
            } else if (values <= 89) {
                System.out.println("Grade:4");
            } else if (values <= 99) {
                System.out.println("Grade:5");
            } else if (values == 100) {
                System.out.println("Grade:Incredible!");
            }

            

        }
}