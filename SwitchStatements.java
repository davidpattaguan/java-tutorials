public class SwitchStatements {

    public static int SwitchStatement1 (int operator,int firstNumber, int secondNumber) {

        switch (operator){
            case 1 :
                System.out.println("Case is Addition");
                return firstNumber + secondNumber;

            case 2:
                System.out.println("Case is Subtraction");
                return firstNumber - secondNumber;

            case 3:
                System.out.println("Case is  Multiplication");
                return firstNumber * secondNumber;

            case 4:
                System.out.println("Case is  Division");
                return firstNumber / secondNumber;

            default:
                System.out.println("Choice not Available.");
                return 0;

        }

    }

}
