package org.example;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static double power(double a, double b){
        return pow(a,b);
    }
    public static void main( String[] args )
    {
        double number1, number2;
//        int op;
//        op = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter Number 1: ");
            number1 = scanner.nextDouble();
            System.out.println();
            System.out.print("Enter Number 2: ");
            number2 = scanner.nextDouble();
            System.out.println();

            double ans = power(number1, number2);
            System.out.println(ans);
            //
        }
    }
}
