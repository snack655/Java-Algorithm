package test.sw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/test/sw/input2.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 10
        int[] ans = new int[T];

        for(int test_case = 1; test_case <= T; test_case++) {
            String data = sc.next();
            int size = data.length();
            int N = 0;
            if(data.startsWith("1")) {
                N++;
            }
            for(int i = 0; i < size - 1; i++) {
                if(data.charAt(i) != data.charAt(i + 1)) {
                    //System.out.println(data.charAt(i) +" "+data.charAt(i+1));
                    N++;
                }
            }
            ans[test_case - 1] = N;
        }
        //출력 -------------------------------------
        for(int i = 0; i < T; i++) {
            System.out.println("#"+(i+1)+" "+ans[i]);
        }
    }
}
