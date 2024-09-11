import java.util.*;
public class JavaBasics{
    public static void NQueen(char board[][],int i){
        
        if(i == board.length){
           print(board);
           return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,i,j)){
         board[i][j]='Q';
         NQueen(board, i+1);
         board[i][j]='X';
            }
        }
    }
   public static void print(char board[][]){
    System.out.println("_______________");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
           System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
   }
   public static boolean isSafe(char board[][],int row,int col){
       for(int i =row;i>=0;i--){
          if(board[i][col] =='Q'){
            return false;
          }
       }
       for(int i=row-1, j =col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j] =='Q'){
          return false;
        }
     }  
     for(int i=row-1, j =col+1;i>=0 && j< board.length;i--,j++){
        if(board[i][j] =='Q'){
          return false;
        }
     }  
     return true;
   }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the number: ");
     int n = sc.nextInt();
     char board[][] = new char[n][n];
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
           board[i][j]='X';
        }
    }
      NQueen(board,0);
    }
}
