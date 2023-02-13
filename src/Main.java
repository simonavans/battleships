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

        while (totalShips > 0 && livesLeft > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Voer een rijnummer in: ");
            int row = sc.nextInt() - 1;
            System.out.println("Voer een kolomnummer in:");
            int column = sc.nextInt() - 1;

            if (row < 0 || row >= 5 || column < 0 || column >= 5) {
                System.out.println("Ongeldige coordinaten. Voer een coordinaat tussen de 1 en de 5 in.");
            } else if (guessedLocations[row][column] == 1) {
                System.out.println("Dit coordinaat is al eerder ingevoerd. Probeer opnieuw.");
            } else {
                System.out.println();
                guessedLocations[row][column] = 1;

                if (board[row][column] == 1) {
                    totalShips--;
                    System.out.println("Je hebt een schip gezonken! Er zijn nog " + totalShips + " schepen over.");
                } else {
                    System.out.println("Mis... :(");
                    livesLeft--;
                }
            }

            displayBoard();
        }

        if (totalShips == 0) {
            System.out.println("Gefeliciteerd, je hebt gewonnen!");
        } else if (livesLeft == 0) {
            System.out.println("Helaas, je hebt verloren!");
        }
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

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " |");

            for (int j = 0; j < 5; j++) {
                if (guessedLocations[i][j] == 1) {
                    if (board[i][j] == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("X = geraakt; Leeg = mis; # = niet geraden.");
        System.out.println("Levens over: " + livesLeft);
        System.out.println();
    }
}