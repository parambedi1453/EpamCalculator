package org.example;

import java.util.*;
import org.example.Calc.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        float number1, number2;
        char op;

        System.out.println("Enter number 1 : ");
        number1 = s.nextFloat();

        System.out.println("Enter number 2 : ");
        number2 = s.nextFloat();

        System.out.println("Enter operator: ");
        op = s.next().charAt(0);

        Calc calci = new Calc(number1, number2, op);
        float result = calci.display();

        System.out.println("Result is "+ result);
    }
}
