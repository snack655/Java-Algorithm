package test.array2;

/*
** 행 우선 탐색 **
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

** 열 우선 탐색 **
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16

** 지그재그 탐색 **
1 2 3 4
8 7 6 5
9 10 11 12
16 15 14 13
*/
public class Ex02_ArraySearchTest {
    static int[][] arr= {{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
    static int row,col;
    public static void main(String[] args) {
        row=arr.length;
        col=arr[0].length;

        System.out.println("** 행 우선 탐색  **");
        searchByRow();
        System.out.println("\n** 열 우선 탐색  **");
        searchByCol();
        System.out.println("\n** 지그재그 탐색  **");
        searchByZigzag();
    }

    public static void searchByRow() {
        for(int i=0; i<row; ++i) {
            for(int j=0; j<col; ++j) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void searchByCol() {
        for(int j=0; j<col; ++j) {
            for(int i=0; i<row; ++i) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void searchByZigzag() {
        for(int i=0; i<row; ++i) {
            if(i%2==0) {
                for(int j=0; j<col; ++j) {
                    System.out.print(arr[i][j]+"\t");
                }
            }else {
                for(int j=col-1; j>=0; --j) {
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}
