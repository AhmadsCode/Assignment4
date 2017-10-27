/*
 * @author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 4.7
 * Problem 9.4
(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character.
*/

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code(an integer between 0 and 127: ");
        // Prompt the user to enter an ASCII code

        int i = input.nextInt();

        System.out.println((char)i);         // Displays ASCII code as a character

    }
}