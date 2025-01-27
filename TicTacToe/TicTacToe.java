package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    String p1;
    String p2;
    boolean currentPlayer = true;
    String piece = "x";
    String[][] board = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};

    public TicTacToe(String p1, String p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void nextPlayer(){
        currentPlayer = !currentPlayer;

        if(currentPlayer) piece = "x";
        else piece = "o";
    }

    public void printBoard(){
        System.out.println("  | 0 | 1 | 2 |");
        for(int r = 0; r<board.length; r++){
            System.out.print(r + " ");
            for(int c = 0; c<board[0].length; c++){
                System.out.print("| " + board[r][c]+" ");
            }
            System.out.println("|");
        }
    }

    public void makeMove(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the row number (0-2) ");
        int row = input.nextInt();
        System.out.println("Please enter the column number (0-2) ");
        int col = input.nextInt();
        board[row][col] = piece;
    }
    public String getPlayerName(){
        if(currentPlayer) return p1; 
        else return p2;
    }
    public boolean checkWin(){
        int row = 0;
        for(int col = 0; col<board[0].length;col++){
            if(board[row][col].equals(piece) && board[row][col].equals(board[row+1][col]) && board[row+1][col].equals(board[row+2][col])) return true;
        }

        int col = 0;
        for(row = 0; row<board[0].length;row++){
            if(board[row][col].equals(piece) && board[row][col].equals(board[row][col+1]) && board[row][col+1].equals(board[row][col+2])) return true;
        }
        int diagonal = 0;
        if(board[diagonal][diagonal].equals(piece) && board[diagonal][diagonal].equals(board[diagonal+1][diagonal+1]) && board[diagonal+1][diagonal+1].equals(board[diagonal+2][diagonal+2])) return true;
        if(board[0][2].equals(piece) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) return true;
        
        return false;
    }

    public boolean checkTie(){
        int count = 0;
        for(int r = 0; r<board.length;r++){
            for(int c = 0; c<board[0].length;c++){
                if(board[r][c].equals("-")) count++;
            }
        }

        if(count == 0) return true;
        else return false;
    }
}