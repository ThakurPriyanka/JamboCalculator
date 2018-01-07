import java.math.*;

public class Calculator
{
    double leftOperand;
    double rightOperand;
    double result;

    public Calculator(double leftOperand)
    {
        this.leftOperand = leftOperand;
    }

    public Calculator(double leftOperand, double rightOperand)
    {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public double addTwoNumber()
    {
        try {
            result = leftOperand + rightOperand;
        }
        catch(ArithmeticException operationException)
        {
            System.out.println(operationException.getLocalizedMessage());
        }
        return result;
    }

    public double subTwoNumber()
    {
        try {
            result = leftOperand - rightOperand;
        }
        catch(ArithmeticException operationException)
        {
        System.out.println(operationException.getLocalizedMessage());
    }
        return result;
    }

    public double divideTwoNumber()
    {
        try {
            result = leftOperand / rightOperand;
        }
        catch(ArithmeticException operationException)
        {
            System.out.println(operationException.getLocalizedMessage());
        }
        return result;
    }

    public double moduleOfNumber()
    {
        try {
            result = leftOperand % rightOperand;
        }
        catch(ArithmeticException operationException)
        {
            System.out.println(operationException.getLocalizedMessage());
        }
        return result;
    }

    public double powerResultOfNumber()
    {
        try {
            result = Math.pow(leftOperand, rightOperand);
        }
        catch(ArithmeticException operationException)
        {
            System.out.println(operationException.getLocalizedMessage());
        }
        return result;
    }

    public double absoluteOfNumber()
    {
        return Math.abs(leftOperand);

    }

    public double minOfNumber(){
        if(leftOperand < rightOperand)
        {
            result = leftOperand;
        }
        else
        {
            result = rightOperand;
        }
        return result;
    }
    public double maxOfNumber(){
        if(leftOperand > rightOperand)
        {
            result = leftOperand;
        }
        else
        {
            result = rightOperand;
        }
        return result;
    }
}
