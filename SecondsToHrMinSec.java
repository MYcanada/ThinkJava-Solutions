/**
 * Exercise 3-3 solution from github
 */
import java.util.Scanner;
public class SecondsToHrMinSec{
    
    public static void main(String[] args) {
        int secsUserInput, hours;
        double minutes, seconds;
       
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of seconds: ");
        secsUserInput = in.nextInt();
        
        hours = secsUserInput / 3600;
        minutes = (double) (secsUserInput % 3600) / 60;
        seconds = (double) (minutes % 1) * 60;
        
        System.out.printf(secsUserInput + "secs converted is " + hours + " hour, %.0f minutes, and %.0f seconds", minutes, seconds);
        
    
    }

}