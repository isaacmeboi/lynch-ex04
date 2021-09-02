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

        System.out.println("Do you " + v +" your " + adj +" "+ n +" "+ adv +"? That's really cringe, bro.");
    }
}
