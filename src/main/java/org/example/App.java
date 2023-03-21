package org.example;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static double power(double a, double b){
        logger.info("[POWER- NUMBER 1] : " + a);
        logger.info("[POWER- NUMBER 2] : " + b);
        double ans = pow(a,b);
        logger.info("[POWER- ANSWER] : "  + ans);
        return ans;
    }

    public static double squareRoot(double a){
        logger.info("[Square Root- NUMBER] : " + a);
        double ans = sqrt(a);
        logger.info("[Square Root- ANSWER] : "  + ans);
        return ans;
    }

    public static double factorial(double a){
        logger.info("[Factorial- NUMBER] : " + a);
        double ans = 1;
        while(a>0){
            ans *= a;
            a--;
        }
        logger.info("[Factorial- ANSWER] : "  + ans);
        return ans;
    }

    public static double naturalLog(double a){
        logger.info("[Natural Log- NUMBER] : " + a);
        double ans = 0;
        if(a<0){
            ans = Double.NaN;
        }
        else
            ans = log(a);

        logger.info("[Natural Log- ANSWER] : "  + ans);
        return ans;
    }

    public static void main( String[] args )
    {
        char entry;
        double number1, number2;

        Scanner scanner = new Scanner(System.in);
        entry = scanner.next().charAt(0);
        System.out.println("SCIENTIFIC CALCULATOR:");
        while(true){
            System.out.println("Enter operation: ");
            System.out.println("1. Power (x^b)");
            System.out.println("2. Square Root (x^(1/2))");
            System.out.println("3. Factorial(x!)");
            System.out.println("4. Natural logarithm (base е) (ln(x))");

            int op;
            op = scanner.nextInt();

            double ans;

            switch(op) {
                case 1:
                    System.out.print("Enter Number 1: ");
                    number1 = scanner.nextDouble();
                    System.out.println();
                    System.out.print("Enter Number 2: ");
                    number2 = scanner.nextDouble();
                    System.out.println();

                    ans = power(number1, number2);
                    System.out.println(ans);
                    break;

                case 2:
                    System.out.print("Enter Number: ");
                    number1 = scanner.nextDouble();
                    System.out.println();

                    ans = squareRoot(number1);
                    System.out.println(ans);
                    break;

                case 3:
                    System.out.print("Enter Number: ");
                    number1 = scanner.nextDouble();
                    System.out.println();

                    ans = factorial(number1);
                    System.out.println(ans);
                    break;

                case 4:
                    System.out.print("Enter Number: ");
                    number1 = scanner.nextDouble();
                    System.out.println();

                    ans = naturalLog(number1);
                    System.out.println(ans);
                    break;

                case 5:
                    System.out.println("Please Enter a valid choice of operation..!");
                    break;

                default:
                    return;
            }
        }
    }
}
