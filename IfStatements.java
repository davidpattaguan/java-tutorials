public class IfStatements {
    public static void IfStatementSample1 () {
        int value = 1;
        System.out.println("This sample breaks if value reaches to 5");

        while(value < 6){
            System.out.println("Value: " + value);

            if(value > 5) {
                break;
            }
            value++;
        }

    }

    public static String IfStatementSample2 (int number) {

        if(number % 2 == 0){
            return "Even";
        } else{
            return "Number is Odd";
        }

    }

    public static void IfStatementSample3 (int number) {

        if(number < 1){
           System.out.print("Number is Lesser than 1");
        } else if (number >=1 && number < 21){

            int initialValue = 0;
            do {
            System.out.println("Hotdogs");
            initialValue++;

            } while(initialValue != number);
        } else {
            System.out.print("Number is Greater than 20!");

        }



    }



}
