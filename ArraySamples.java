public class ArraySamples {


    public static void ArrayofNumbers() {

        //  Declaring Single Value
        int value = 69;
        // Instantiating Multiple Values via Array without initial values
        int[] values;
        values = new int[3];
        // This prints "0" cause values[0] is not yet instantiated
        System.out.println(values[0]);

        // Instatiate values[0]
        values[0]=69;

        System.out.println(values[0]);


    }

    public static void ArrayofStrings() {

        String[] stringValues = {"David","Niño","Angelo"};
        System.out.println(stringValues.length);

        for (int i=0; i < stringValues.length ; i++){
            System.out.print("1st Way of iteration: " + stringValues[i]);
        }


        for (String stringValue: stringValues){
            System.out.print("2nd Way of iteration: " + stringValue);
        }


    }


    public static void MultiDimensionalArrays() {




    }




}
