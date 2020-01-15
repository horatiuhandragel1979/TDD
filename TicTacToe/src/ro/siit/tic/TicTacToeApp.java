package ro.siit.tic;

import java.util.Scanner;

public class TicTacToeApp {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        while (game.isOver() ==0) {
            Scanner sc = new Scanner(System.in);
            int line = sc.nextInt();
            int col = sc.nextInt();

            game.makeMove(line, col);

        }
    }
}
