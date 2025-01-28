package TicTacToe;
import java.util.Scanner;

public class TicTacToePlay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of player 1:");
        String p1 = input.nextLine();
        System.out.println("Enter the name of player 2:");
        String p2 = input.nextLine();
        TicTacToe ttt = new TicTacToe(p1, p2);
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
