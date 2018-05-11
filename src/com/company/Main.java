/*Write a ConsoleProgram that reads in a list of integers, one per line, until a sentinel
value of 0 (which you should be able to change easily to some other value). When
the sentinel is read, your program should display the smallest and largest values in the
list, as illustrated in this sample run:
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest, biggest, a, ender;
        System.out.print("give number: ");
        a = scanner.nextInt();
        smallest = a;
        biggest = a;
        ender=0;

        while (a!=ender){
            System.out.print("give number: ");
            a = scanner.nextInt();
                if (a!=ender && a < smallest) {
                    smallest = a;
                }
                if (a!=ender && a > biggest) {
                    biggest = a;
                }

        }
        System.out.println("smallest of given number is: "+smallest);
        System.out.println("biggest of given numbers is: "+biggest);

    }
}
