/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a temperature in either F or C: ");
        double temp = scan.nextInt();
        System.out.print("Enter C to convert to Celsius and F to convert to Fahrenheit: ");
        scan.nextLine();
        String conversion = scan.nextLine();
        if(conversion.compareTo("c") == 0 || conversion.compareTo("C") == 0){
            double temp2 = (temp-32) * 5 /9;
            System.out.printf("The temperature in celsius is %.1f",temp2);
        }
        else {
            System.out.printf("The temperature in fahrenheit is: %.1f", (temp * 9/5 + 32));
        }
    }
}