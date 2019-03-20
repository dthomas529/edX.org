/* Interactive app for user to input desired travel destination, length of stay, and budget.  Program outputs cost of stay in the currency of destination.*/

import java.util.Scanner;

public class  tripPlanner{
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Global Adventures!"); 
        Greeting();
        TravelTimeBudget();
        
    }  
    public static void Greeting() {
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you, " + name);
        System.out.println("What destination are you interested in visiting?");
        String destination = input.nextLine();
        System.out.println("Fanastic!  " + destination + " is a wonderful place to visit.");
     }
     public static void TravelTimeBudget() {
    System.out.println("How many days are you planning to stay in" + destination + "?");
    int days = input.nextInt();
    System.out.println("What is the total amount you are planning to spend?");
    double amount = input.nextDouble();
    System.out.println("What is the currency symbol for" + destination + "?");
    String symbol = input.nextLine();
		
		
