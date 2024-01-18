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

        int [][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        char[][] chessBoard = {
                {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
        };


        System.out.println("3x3 Grid");

        for(int row=0; grid.length > row  ; row++){
            for(int col=0; col < grid[row].length ; col++){
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Chessboard");
        for(int row=0; chessBoard.length > row  ; row++){
            for(int col=0; col < chessBoard[row].length ; col++){
                System.out.print(chessBoard[row][col] + " ");
            }
            System.out.println();
        }
    }




}
