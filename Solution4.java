package test.sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
    private static boolean road;
    private static int[][] map = new int[100][100];
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/test/sw/input4.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Ans = new int[10];
        for (int t = 1; t <= 10; t++) {
            int n = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < 100; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < 100; j++) {
                    map[i][j] = Integer.parseInt(str[j]);
                }
            }
            for (int i = 0; i < 100; i++) {
                if (map[99][i] == 2) {
                    Ans[t-1] = searchStartPoint(99, i);
                    break;
                }
            }
        }
        for(int i = 0; i < 10; i++) {
            System.out.println("#"+(i+1)+" "+Ans[i]);
        }
    }

    static int[] dx = {-1, 1};
    public static int searchStartPoint(int y, int x) {
        while(true) {
            if(y == 0) {break;}
            road = false;
            for(int d = 0; d < 2; d++) {
                int nx = x + dx[d];
                if(nx < 0 || nx >= 100) {continue;}
                if(map[y][nx] == 1) {
                    road = true;
                    x = nx;
                    while (true) {
                        nx = x + dx[d];

                        if(nx < 0 || nx >= 100 || map[y][nx] == 0) {break;}
                        else {x = nx;}
                    }
                }
                if(road) {break;}
            }
            y--;
        }
        return x;
    }

}
