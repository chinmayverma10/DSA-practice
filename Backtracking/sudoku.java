public class sudoku {
    public static void print_sudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static boolean issafe(int sudoku[][],int row,int col,int digit){
        //Row
        for(int i=0;i<9;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        //Column
        for(int i=0;i<9;i++){
            if(sudoku[row][i] == digit){
                return false;
            }
        }
        //for grid
        int start_row = (row/3)*3;
        int start_col = (col/3)*3;

        for(int i=start_row;i<start_row+3;i++){
            for(int j=start_col;j<start_col+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean soduko_solver(int sudoku[][],int row,int col){
        if(row == 9){
            print_sudoku(sudoku);
            return true;
        }
        int next_row = row;
        int next_col = col+1;
        if(col + 1 == 9){
            next_row = row+1;
            next_col = 0;
        }
        if(sudoku[row][col] != 0){
            return soduko_solver(sudoku, next_row, next_col);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(soduko_solver(sudoku, next_row, next_col)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int sudoko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 }, 
                           { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                           { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                           { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                           { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                           { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                           { 0, 3, 0, 0, 7, 2, 0, 0, 4 }, 
                           { 0, 4, 9, 0, 3, 0, 0, 5, 7 }, 
                           { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if(soduko_solver(sudoko,0,0)){
            System.out.println("Solution exist");
        }else{
            System.out.println("No solution");
        }
        
        // print_sudoku(sudoko);
    }
}
