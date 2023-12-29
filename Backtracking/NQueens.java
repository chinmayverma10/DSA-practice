public class NQueens {
    public static void printboard(char board[][]){
        System.out.println("--------CHESS BOARD--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
            
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //For vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //For Diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static int count = 0;
    public static void nqueen(char board[][],int row){
        if(row == board.length){
            printboard(board);
            count++;
            return;
        }

        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                nqueen(board, row+1);
                board[row][i] = '.';
            }
        }
    }
    public static void main(String[] args) {
        int n = 7;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nqueen(board, 0);
        System.out.println("Total ways to solve nqueens = "+count);
    }
}
