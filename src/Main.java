import java.util.Scanner;

public class Main {
    static int[][] guessedLocations = new int[5][5];
    static int[][] board = new int[5][5];
    static int totalShips = 4;
    static int livesLeft = 15;

    public static void main(String[] args) {
        initializeBoard();
        System.out.println("Welkom bij zeeslag! Om te winnen moet je " + totalShips + " schepen raken.");
        System.out.println("Succes!");
        displayBoard();
        System.out.println("X = geraakt; Leeg = mis; # = niet geraden.");

        // todo 1a
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Voer een rijnummer in: ");
            int row = input.nextInt() - 1;
            System.out.println("Voer een kolomnummer in:");
            int column = input.nextInt() - 1;

            // todo 1b
            if (true) {

            } else if (guessedLocations[row][column] == 1) {
                System.out.println("Dit coordinaat is al eerder ingevoerd. Probeer opnieuw.");
            } else {
                System.out.println();
                // todo 1c

                // todo 1d
                if (true) {

                } else {

                }
            }

            // todo 2e
        }

        // todo 1e
    }

    public static void initializeBoard() {
        int shipsPlaced = 0;

        while (shipsPlaced < totalShips) {
            int targetRow = (int) (Math.random() * 5);
            int targetColumn = (int) (Math.random() * 5);

            if (board[targetRow][targetColumn] != 1) {
                board[targetRow][targetColumn] = 1;
                shipsPlaced++;
            }
        }
    }

    public static void displayBoard() {
        System.out.println("   1 2 3 4 5");
        System.out.println("   ---------");

        int rowCounter = 0;

        // todo 2a
        while (rowCounter < 1) {
            int columnCounter = 0;

            // todo 2b

            while (columnCounter < 1) {
                // todo 2c
                if (true) {
                    if (true) {

                    } else {

                    }
                } else {

                }

                columnCounter = columnCounter + 1;
            }
            System.out.println();
            
            rowCounter = rowCounter + 1;
        }
        System.out.println("Levens over: " + livesLeft);
        System.out.println();
    }
}