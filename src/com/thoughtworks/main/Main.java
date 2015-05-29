package com.thoughtworks.main;

public class Main {

    public void printSingleAsterisk() {
        System.out.println("*");
    }

    public void printHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void printRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printIsoscelesTriangle(int n) {
        int asteriskCount = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriskCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            asteriskCount += 2;
        }
    }

    public void printDiamond(int n) {
        int asteriskCount = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriskCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            asteriskCount += 2;
        }

        asteriskCount -= 4;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriskCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            asteriskCount -= 2;
        }
    }

    public void printDiamondWithName(int n, String name) {
        int asteriskCount = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriskCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            asteriskCount += 2;
        }

        System.out.println(name);
        asteriskCount -= 2;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriskCount; j++) {
                System.out.print("*");
            }
            System.out.println();
            asteriskCount -= 2;
        }
    }

    public void fizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.printSingleAsterisk();
        main.printHorizontalLine(5);
        main.printVerticalLine(5);
        main.printRightTriangle(5);
        main.printIsoscelesTriangle(5);
        main.printDiamond(5);
        main.printDiamondWithName(3, "arun");
        main.fizzBuzz();
//        System.out.println(main.generate(625));
    }
}
