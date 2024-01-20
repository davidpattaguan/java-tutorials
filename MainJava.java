import ocean.Fish;

import java.util.Scanner;

public class MainJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable Declarations
        Boolean variable1;
        Number variable2;
        String variable3;

        // Object Instantiation
        Variables b = new Variables();
        WhileLoops a = new WhileLoops();
        ForLoops c = new ForLoops();
        IfStatements d = new IfStatements();
        IfStatements e = new IfStatements();
        SwitchStatements f = new SwitchStatements();
        ArraySamples g = new ArraySamples();
        StringBuilderSample h = new StringBuilderSample();

        // Operations
        variable1 = b.IAmBoolean();
        variable2 = b.IAmNumber();
        variable3 = b.IAmString();

        // Output Variable Types
        System.out.println("Boolean Type:\n" + variable1);
        System.out.println("Number Type:\n" + variable2);
        System.out.println("String Type:\n" + variable3);

        // While Loop Sample
        System.out.println("While Loop Sample");
        a.WhileLoopSample();

        // For Loop Sample
        System.out.println("For Loop Sample");
        c.ForLoopSample();

        // If Statement Samples
        System.out.println("If Statement Case 1");
        d.IfStatementSample1();

        System.out.println("Determine if a number is odd or even");
        System.out.print("Enter a number: ");
        int value = input.nextInt();
        System.out.println(d.IfStatementSample2(value));

        System.out.println("[DO-WHILE] Pick a number from 1-20 then print hotdogs accordingly with the number selected");
        System.out.print("Enter a number from 1-20: ");
        int number = input.nextInt();
        e.IfStatementSample3(number);

        // Calculator 101
        System.out.println("Calculator 101: Apply mathematical operations with 2 numbers");
        int firstNumber, secondNumber;
        System.out.println("Select an Operator: [1] Add, [2] Subtract, [3] Multiply, [4] Divide");
        int operatorValue = input.nextInt();
        System.out.println("Enter First Number: ");
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber = input.nextInt();
        System.out.println("Calculated Number is: " + f.SwitchStatement1(operatorValue, firstNumber, secondNumber));

        // Array Operations
        g.ArrayofNumbers();
        g.ArrayofStrings();
        g.MultiDimensionalArrays();

        // Person Class
        System.out.println("PERSON CLASS");
        Person david = new Person(5, "david", "Male");
        Person unknown = new Person();

        david.setAge(23);
        david.setName("David");

        david.introduceSelf();
        unknown.introduceSelf();

        System.out.println(Person.count);

        // StringBuilderSample
        System.out.println(h);

        // Dog Class Inheritance
        System.out.println("ACME CORPORATION ZOO FORM");
        Dog mochi = new Dog("Mocha", 5, "Shitsu");
        mochi.wagTail();
        System.out.print(mochi.getBreed());

        // Cat Class Inheritance
        System.out.println("ACME CORPORATION ZOO FORM");
        Cat lecarose = new Cat("Lecarose", 5, "Ascat");
        lecarose.wagTail();
        System.out.print(lecarose.getBreed());

        // Fish Package
        System.out.println("Package Sample");
        Fish goldy = new Fish();
        goldy.swim();

        System.out.print("Interfaces");
        System.out.print("Public Private Protected");
    }
}
