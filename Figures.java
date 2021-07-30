/*
    Hniangtha Thluai
    7/30/21
    Programming Fundamentals
    Summer 2021
    Programming Assignment 2

 */
import java.util.Scanner;
public class Figures {
    //main method
    public static void main(String[] args) {

        int option;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the figure (odd number): ");

        int size = scan.nextInt();

        while (size % 2 == 0) {
            System.out.println("Invalid figure size - must be an odd number" + "\n");
            System.out.print("Re-enter the size of the figure: ");
            size = scan.nextInt();

        }
        do // loop to display a menu and user input
        {
            System.out.println();
            System.out.print("MENU:" + "\n");
            System.out.println("1. Print box");
            System.out.println("2. Print diamond");
            System.out.println("3. Print X");
            System.out.println("4. Quit program" + "\n");

            System.out.print("Please select an option: ");

            option = scan.nextInt();
            /*
            this statement:
            - calls appropriate method
            - print the corresponding figure shape
             */
            switch (option) {
                case 1:
                    printBox(size);
                    break;
                case 2:
                    printDiamond(size);
                    break;
                case 3:
                    printX(size);
                    break;
                case 4:// if option 4 is selected, program will quit
                    System.out.println("Good bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid");
            }
        } while( option != 4);
        scan.close();
    }
    // method to print Box
    static void printBox(int size) {

        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
    // method to print Diamond
    static void printDiamond(int size) {

        size = (size/2+1) + (size%2);

        for (int i = 0; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k <= i * 2 - 1; k++) {
                if (k == 2 || k == i * 2 - 1) {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = size-1; i >= 1; i--) {
            for (int j = 1; j <= size-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k <= i*2-1; k++) {
                if (k == 2 || k == i * 2 - 1) {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // method to print X
    static void printX (int size) {

        System.out.println();

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || size == i + j + 1) {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
