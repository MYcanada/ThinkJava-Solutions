/**
 * Write a program that converts a total number of seconds to hours, minutes, and seconds. 
 * It should (1) prompt the user for input, 
 * (2) read an integer from the keyboard, 
 * (3) calculate the result, and 
 * (4) use printf to display the output. 
 * For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".
 * Hint: Use the modulus operator.
 */
import java.util.Scanner;
public class chapter3Exercise3{
    public static void main(String[] args){
        int sec, min, hr;
        int remaindersec, remaindermin;
        final int MIN_PER_HR = 60;
        final int SEC_PER_MIN = 60;
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many seconds?");
        sec = in.nextInt(); //(1) (2)
        
        min = sec / SEC_PER_MIN;
        remaindersec = sec % SEC_PER_MIN;
        
        hr = min / MIN_PER_HR;
        remaindermin = min % MIN_PER_HR; //(3)
        
        System.out.print("Second to hour and minutes: ");
        System.out.println(hr + " hours " + remaindermin + " minutes " + remaindersec + " seconds");
        // ? How to use printf as (4) asked?
        
        
        
    }
}