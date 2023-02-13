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

        // 1a
        while (true) {
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("Voer een rijnummer in: ");
            int row = consoleInput.nextInt() - 1;
            System.out.println("Voer een kolomnummer in:");
            int column = consoleInput.nextInt() - 1;

            // 1b
            if (true) {

            } else if (guessedLocations[row][column] == 1) {
                System.out.println("Dit coordinaat is al eerder ingevoerd. Probeer opnieuw.");
            } else {
                // 1c
                guessedLocations[row][column] = 1;

                // 1d
                if (true) {

                } else {

                }
            }


        }

        // 1e
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

        // 2a
        for (int row = 0; row < 1; row++) {
            // 2b

            for (int column = 0; column < 1; column++) {
                // 2c
                if (true) {
                    if (true) {

                    } else {

                    }
                } else {

                }
            }
            System.out.println();
        }
        System.out.println("X = geraakt; Leeg = mis; # = niet geraden.");
        System.out.println("Levens over: " + livesLeft);
        System.out.println();
    }
}