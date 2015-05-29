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

    public static void main(String[] args) {
        Main main = new Main();

        main.printSingleAsterisk();
        main.printHorizontalLine(5);
        main.printVerticalLine(5);
//        main.printRightTriangle(5);
//        main.printIsoscelesTriangle(5);
//        main.printDiamond(5);
//        main.printDiamondWithName(3, "arun");
//        main.fizzBuzz();
//        System.out.println(main.generate(625));
    }
}
