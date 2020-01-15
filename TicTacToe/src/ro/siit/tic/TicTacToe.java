package ro.siit.tic;

public class TicTacToe {

    private char turn = 'x'; //x este tot timpul primul jucator care incepe
private char[][] board = new char[][]{{'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}} ;

    /**
     * Method returns the current player that has to make the next turn
     * @return
     */
    public char getTurn() {
        return turn;
    }

    public void makeMove(int line, int column) {

        board[line][column] = turn;

        if (turn == 'x'){
            turn = '0';
        } else {
            turn = 'x';
        }

    }

    public char[][] getBoard() {
        return board;
    }

    public int isOver() {
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length;j++){
                if (board[i][j] =='-'){
                    return 0;
                }
            }
        }
        return -1;
    }
}
