public class MainJava {
    public static void main (String[] args){
        WhileLoops a = new WhileLoops();
        Variables b = new Variables();
        ForLoops c = new ForLoops();
        IfStatements d = new IfStatements();

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
        
        System.out.print(d.IfStatementSample2(5));


    }
}
