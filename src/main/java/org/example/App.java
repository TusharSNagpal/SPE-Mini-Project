package org.example;
import java.util.Scanner;
import static java.lang.Math.pow;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        }
    }
}
