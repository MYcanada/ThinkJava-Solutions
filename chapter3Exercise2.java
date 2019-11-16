/**
 * Exercise 3.2 
 * Write a program that converts a temperature from Celsius to Fahrenheit. 
 * It should (1) prompt the user for input, 
 * (2) read a double value from the keyboard, 
 * (3) calculate the result, and 
 * (4) format the output to one decimal place. 
 * For example, it should display "24.0 C = 75.2 F".
 * F = C*(9/5) + 32
 */
import java.util.Scanner;
public class chapter3Exercise2{
    public static void main(String[] args){
        double C, F;
        
        Scanner in = new Scanner(System.in);
        System.out.println("What is the temperature?");
        C = in.nextDouble(); //(1) prompt the user for input; (2) read a double value from the keyboard;
        F = C * (9d/5d) + 32; // d after the fraction forces compiler to see the number as double (3)
        System.out.print("The temperature is ");
        System.out.printf("%.1f C = %.1f F\n", C, F);   //(4)
    }

}