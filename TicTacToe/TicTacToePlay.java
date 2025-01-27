package TicTacToe;

public class TicTacToePlay {
    public static void main(String[] args){
        TicTacToe ttt = new TicTacToe("Nathan" ,"Ruth");
        ttt.printBoard();
        for(int i = 0;i<9;i++){
        ttt.makeMove();
        ttt.printBoard();
        if(ttt.checkWin()) {
            System.out.println("Woohoo, " + ttt.getPlayerName() + ", you won!!!!!");
            break;
        }
        if(ttt.checkTie()) {
            System.out.println("Tie game");
            break;
        }

        ttt.nextPlayer();
        }
    }
}
