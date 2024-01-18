import java.util.Scanner;

public class MainJava {
    public static void main (String[] args){
        WhileLoops a = new WhileLoops();
        Variables b = new Variables();
        ForLoops c = new ForLoops();
        IfStatements d = new IfStatements();
        IfStatements e = new IfStatements();
        SwitchStatements f = new  SwitchStatements();
        ArraySamples g = new  ArraySamples();


        Scanner input = new Scanner(System.in);

        Boolean variable1 = b.IAmBoolean();
        Number variable2 = b.IAmNumber();
        String variable3= b.IAmString();

        System.out.println("Boolean Type:");
        System.out.println(variable1);
        System.out.println("Number Type:");
        System.out.println(variable2);
        System.out.println("String Type:");
        System.out.println(variable3);

        System.out.println("While Loop Sample");
        a.WhileLoopSample();


        System.out.println("For Loop Sample");
        c.ForLoopSample();

        System.out.println("If Statement Case 1");
        d.IfStatementSample1();

        System.out.println("Determine if a number is odd or even");
        System.out.print("Enter a number: ");
        int value= input.nextInt();
        System.out.println(d.IfStatementSample2(value));


        System.out.println("[DO-WHILE] Pick a number from 1-20 then print hotdogs accordingly with the number selected");
        System.out.print("Enter a number from 1-20: ");
        int number= input.nextInt();
        e.IfStatementSample3(number);


        System.out.println("Calculator 101: Apply mathematical operations with 2 numbers");
        int firstNumber = 0;
        int secondNumber = 0;
        System.out.println("Select an Operator: [1] Add, [2] Subtract, [3] Multiply, [4] Divide");
        int operatorValue= input.nextInt();
        System.out.println("Enter First Number: ");
        firstNumber= input.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber= input.nextInt();
        System.out.println("Calculated Number is: " + f.SwitchStatement1(operatorValue,firstNumber,secondNumber));


        g.ArrayofNumbers();
        g.ArrayofStrings();



    }
}
