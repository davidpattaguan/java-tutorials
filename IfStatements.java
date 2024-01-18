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

    public static String IfStatementSample3 (int number) {

        if(number < 1){
            return "Number is Less than 0! Please Try Again.";
        } else if (number >=1 && number < 21){

            int initialValue = 0;
            do {
            System.out.println("Hotdogs");
            initialValue++;

            } while(initialValue != number);
        } else {
            return "Number is Greater than 20!";
        }

        return null;

    }



}
