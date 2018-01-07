import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){
        Calculator calculatorObj;
        double result;
        double leftOperand=0, rightOperand=0;
        int choice;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your choice : ");
        choice = sc.nextInt();

        if(choice == 6 )
        {
            System.out.println("Enter the left operand : ");
            leftOperand = sc.nextDouble();
        }
        else
        {
            System.out.println("Enter the left operand : ");
            leftOperand = sc.nextDouble();
            System.out.println("Enter the right operand : ");
            rightOperand = sc.nextDouble();
        }


        switch(choice){

            case 1:
                calculatorObj = new Calculator(leftOperand,rightOperand);
                result = calculatorObj.addTwoNumber();
                System.out.println("Result of addition is : " + result);
                break;
            case 2:
                calculatorObj = new Calculator(leftOperand,rightOperand);
                result = calculatorObj.subTwoNumber();
                System.out.println("Result of subtraction is : " + result);
                break;
            case 3:
                calculatorObj = new Calculator(leftOperand,rightOperand);
                result = calculatorObj.divideTwoNumber();
                System.out.println("Result of division is : " + result);
                break;
            case 4:
                calculatorObj = new Calculator(leftOperand,rightOperand);
                result = calculatorObj.moduleOfNumber();
                System.out.println("Result of modulation is : " + result);
                break;
            case 5:
                calculatorObj = new Calculator(leftOperand,rightOperand);
                result = calculatorObj.powerResultOfNumber();
                System.out.println("Result of power is : " + result);
                break;
            case 6:
                calculatorObj = new Calculator(leftOperand);
                result = calculatorObj.absoluteOfNumber();
                System.out.println("Absolute number is : " + result);
                break;
            case 7:
                calculatorObj = new Calculator(leftOperand,rightOperand);
                result = calculatorObj.minOfNumber();
                System.out.println("Minimum among two is : " + result);
                break;
            case 8:
                calculatorObj = new Calculator(leftOperand,rightOperand);
                result = calculatorObj.maxOfNumber();
                System.out.println("Maximum among two is  : " + result);
                break;
            default:
                System.out.println("You have enter the the wrong choice. ");
        }
    }
}
