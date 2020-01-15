package ro.siit.tic;

import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    // test unitar ca jucatorul x este mereu primul

    @Test
    public void testFirstPlayerIsX() {
        TicTacToe game = new TicTacToe();
        char player = game.getTurn();
        Assert.assertEquals('x', player);

    }

    @Test
    public void testSecondPlayerIs0() {
        TicTacToe game = new TicTacToe();
        game.makeMove(1, 1);

        char player = game.getTurn();
        Assert.assertEquals('0', player);

        //verificam daca s{-a schimbat 0 cu x
        game.makeMove(0, 0);
        player = game.getTurn();
        Assert.assertEquals('x', player);

    }

    @Test
    public void testInitialBoardState() {
        char[][] initialBoardState = {{'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}};
        TicTacToe game = new TicTacToe();
        char[][] gameBoard = game.getBoard();

        Assert.assertArrayEquals(initialBoardState, gameBoard);

    }

    @Test
    public void firstMove() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0);
        Assert.assertEquals(game.getBoard()[0][0], 'x');
     //   Assert.assertEquals(game.getBoard()[0][0], '0');

    }

    @Test
    public void testBoardIsFull(){
        TicTacToe game = new TicTacToe();

        game.makeMove(0,0);
        game.makeMove(0,1);

        int over = game.isOver();

        Assert.assertEquals(-1, over);
    }
}
