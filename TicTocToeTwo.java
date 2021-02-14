import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Random;
import java.util.Scanner;

public class TicTocToeTwo {

    public static void main(String[] args) {
        playGame();
    }

    static void playGame() {
        char[][] field = createField();
        drawField(field);

        while (true) {

            while (!checkPlayerMove(field)) {
                return;
            }

            while (!checkCompMove(field)) {
                return;
            }
        }
    }

    static boolean checkPlayerMove(char[][] field) {
        doPlayerMove(field);
        drawField(field);
        return checkIsMoveAvailable(field, 'X', "Вы выирали!");
    }

    static boolean checkCompMove(char[][] field) {
        doCompMove(field);
        drawField(field);
        return checkIsMoveAvailable(field, 'O', "Вы проиграли!");
    }

    static boolean checkIsMoveAvailable(char[][] field, char sign, String winMessage) {
        if (isDrow(field)) {
            System.out.println("Ничья!");
            return false;
        }
        if (isWin(field, sign)) {
            System.out.println(winMessage);
            return false;
        }
        return true;
    }

    static void doPlayerMove(char[][] field) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        do {
            x = checkCoordinateRange(scanner, 'X');
            y = checkCoordinateRange(scanner, 'Y');
        } while (isCellFree(field, x, y));
        field[x][y] = 'X';
    }

    static int checkCoordinateRange(Scanner scanner, char coorName) {
        int val;
        do {
            System.out.printf("Введите координату %s от 1 до 3х%n", coorName);
            val = scanner.nextInt() - 1;
        } while (val < 0 || val > 2);
        return val;
    }

    static void doCompMove(char[][] field) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (isCellFree(field, x, y));

        field[x][y] = 'O';

    }

    static boolean isDrow(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    static boolean isWin(char[][] field, char sign) {
        int summ = 0;
        int summ2 = 0;
        int summ3 = 0;
        int summ4 = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == field[i][j + 1] && field[i][j] == sign) summ++;
                if (summ == 3) {
                    return true;
                }
                if (field[i][j] == field[i + 1][j] && field[i][j] == sign) summ2++;
                if (summ2 == 3) return true;
                if (field[i][j] == field[i + 1][j + 1] && field[i][j] == sign) summ3++;
                if (summ3 == 3) return true;
                if (field[i][j] == field[i + 1][j - 1] && field[i][j] == sign) summ4++;
                if (summ4 == 3) return true;
            }
        }
        return false;
    }


    static boolean isCellFree(char[][] field, int x, int y) {
        return field[x][y] != '-';
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


}


