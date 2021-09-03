/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise04;
import java.util.Scanner;
public class Solution04 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter noun: ");
        String n = sc.nextLine();

        System.out.print("Enter a verb: ");
        String v = sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = sc.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = sc.nextLine();

        System.out.println("Do you " + v +" your " + adj +" "+ n +" "+ adv +"? That's pretty cringe, bro.");
    }
}
/*almost forgot the puesdocode, sorry abt that. so the first thing that's done in this project is that
java.util is imported for the scanner function. next a main function is declared. after that, an instance
and declaration of the scanner function is made. after that there are numerous print statements for the
prompts given to the user, after those are scanner functions to read in user's input. the last line of
code (line 20) prints out all the user's inputs in the correct format.
 */