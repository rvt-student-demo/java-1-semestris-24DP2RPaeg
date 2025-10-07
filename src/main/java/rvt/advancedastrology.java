package rvt;

public class advancedastrology {

    // Part 1: print spaces (no line break)
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    // Part 1: print stars (with line break)
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Part 2: print right-leaning triangle
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}

