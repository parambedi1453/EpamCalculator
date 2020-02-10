package org.example.Calc;

import org.example.Opr.Opr;

public class Calc extends Exception{
    private float number1;
    private float number2;
    private char op;
    private Opr opr;

    public Calc(float a, float b, char o)
    {
        number1 = a;
        number2 = b;
        op = o;

        opr = new Opr();
    }

    public float display()
    {
        if(op == '+')
            return opr.add(number1,number2);
        else if(op == '-')
            return opr.sub(number1,number2);
        else if(op == '/')
            return opr.divide(number1,number2);
        else if(op == '*')
            return opr.multiply(number1,number2);
        else if(op == '%')
            return opr.modulus(number1,number2);
        else
            throw new ArithmeticException();
    }
}
