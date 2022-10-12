 /*
  *  Note: Try to find formula relating rows and cols
  *
  *  step 1: no. of lines = no. rows = no. of  times outer for loop will run
  * step 2: Identify no. of columns for every row and types of columns
  * step 3: What we need to print
  *
  * */

public class JavaPattern {
    public static void main(String[] args){
     // pattern1(4);
     // pattern2(4);
     // pattern3(5);
     //   pattern4(5);
     //   pattern5(5);
      //  pattern6(5);
      //  pattern7(5);
     //   pattern8(5);
        pattern9(3);
    }

    static void pattern1(int n){
        for(int row=1; row<=n; row++){
         //for every row print col
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            //for every row print col
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //col = n - row
    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            //for every row print col
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1; row<=(2*n -1); row++){
            //for every row print col
            int toatalColsInRows=0;
            if(row>n){
                // row-n -> no. of space and n-(row-n) will give no. of columns
                toatalColsInRows= n - (row-n);
            }
            else{
                toatalColsInRows=row;
            }
            for(int col=1; col<=toatalColsInRows; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
  /*        *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *        */



    static void pattern6(int n){

        for(int row=1; row<=(2*n -1); row++){
            //for every row print col
            int toatalColsInRows= row > n ? n - (row-n) : row ;
//            if(row>n){
//                // row-n -> no. of space and n-(row-n) will give no. of columns
//                toatalColsInRows= ;
//            }
//            else{
//                toatalColsInRows=row;
//            }
            int totalSpace = n-toatalColsInRows;
            for(int s=1; s<=totalSpace; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=toatalColsInRows; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

 static void pattern7(int n){
    for(int row=1; row<=n; row++){
        int space= n-row;
        for(int s=1; s<=space; s++){
            System.out.print(" ");
            System.out.print(" ");
        }

        for(int col=row; col>=1; col--){
            System.out.print(col+" ");
        }
        for(int col=2; col<=row; col++){
            System.out.print(col+" ");
        }
        System.out.println();
    }
 }
/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */

    static void pattern8(int n){
        for(int row=1; row<=(2*n-1); row++){
            int totalCol = row>n ? (2*n-row):row;
            int space= n-totalCol;
            for(int s=1; s<=space; s++){
                System.out.print(" ");
                System.out.print(" ");
            }
            for(int col=totalCol; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=totalCol; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

 */

  static void pattern9(int n){
     n=8;
     int N = n*2;
      for(int row=1; row<N;row++){
//          System.out.print(row);
          for(int col=1; col<N; col++){
              int atEveryIndex = n-Math.min(Math.min(row,col),Math.min((N-row),(N-col)))+1;
              System.out.print(atEveryIndex+" ");
          }
          System.out.println();
      }
  }






}
