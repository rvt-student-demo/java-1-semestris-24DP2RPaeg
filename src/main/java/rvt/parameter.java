package rvt;

public class parameter {
    public static void main(String[] args) {
        printUntilNumber(5);  // izdrukās 1, 2, 3, 4, 5
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}




