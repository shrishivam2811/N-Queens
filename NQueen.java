import java.util.Scanner;

public class NQueen {
    public static void rule (char[][] board,int row) {
        int n= board.length;
        if (row == n) {                            //base case
            for(int i = 0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]= 'Q';
                rule(board,row+1);
                board[row][j] ='-';  //backtracking
            }
        }

    }
    public static boolean isSafe(char[][]board,int row,int colum) {

        int n = board.length;
        //row
        for(int j=0;j<n;j++){
            if(board[row][j]== 'Q') return false;
        }
        //check column
        for(int i=0;i<n;i++){
            if(board[i][colum]== 'Q') return false;
        }
        //upper right
        int i = row;
        int j = colum;
        while(i>=0 && j<n){
            if(board[i][j]== 'Q') return false;
            i--;
            j++;
        }
        //lower right
        i = row;
        j = colum;
        while(i<n && j<n) {
            if (board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //lower left
        i = row;
        j = colum;
        while(i<n && j>=0) {
            if (board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        //upper left
        i = row;
        j = colum;
        while(i>=0 && j>=0) {
            if (board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //Board
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '-';
            }
        }
        rule(board,0);
    }
}

