/**
 * Exercise 3.4
 * The goal of this exercise is to program a \Guess My Number" game.
 */

import java.util.Random;
import java.util.Scanner;
public class chapter3Exercise4{
    
    public static void main(String[] args) {
        //pick a random number
        Random random = new Random();
        int UserGuess;
        int number = random.nextInt(100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        System.out.println("Your guess is " + guess);
        
        System.out.println("The number I was thinking of is " + number);
        
        int difference = guess - number;
        System.out.println("You were off by: " + difference);
        
            
    } 


}