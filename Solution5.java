package test.sw2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//[문제 해결 기본] 2일차 - Ladder1(1210 - D4) - 선생님 풀이 내 풀이는 src/test/sw/solution4
public class Solution5 {
    public static int Ladder[][] = new int[100][100];
    public static boolean find = false; // 2를 찾으면 true


    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/test/sw/input4.txt"));
        Scanner sc = new Scanner(System.in);
        find = false;
        int result = 0;

        for(int tc = 1; tc <= 10; tc++) {
            int tc_cnt = sc.nextInt();

            //사다리 배열 생성 ------------------------------
            for(int row = 0; row < 100; row++) {
                for(int col = 0; col < 100; col++) {
                    Ladder[row][col] = sc.nextInt();
                }
            }
            //사다리타기 ---------------------------
            for(int col = 0; col < 100; col++) {
                if(Ladder[0][col] == 1) {
                    findX(0, col); // 출발점 : (0, 0), (0, 1), (0, 2), (0, 3) ~ (0, 99)

                    if(find) {
                        result = col; // 출발열을 result에 대입
                        break;
                    }
                }
            }
            System.out.println("#"+tc_cnt+" "+result);
        }
    }
    private static void findX(int i, int j) {
        boolean visited[][] = new boolean[100][100];

        while(i < 100) {
            visited[i][j] = true;
            if(Ladder[i][j] == 2) {
                find = true;
                break;
            }

            if(j - 1 >= 0 && Ladder[i][j - 1] == 1 && visited[i][j - 1] == false) { //왼쪽으로 이동
                j--;
            }else if(j + 1 < 100 && Ladder[i][j + 1] == 1 && visited[i][j + 1] == false) { //오른쪽으로 이동
                j++;
            } else {  //아래쪽으로 이동
                i++;
            }
        }
    }
}
