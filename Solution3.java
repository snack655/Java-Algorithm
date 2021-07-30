package test.sw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/test/sw/input3.txt"));
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[10];

        for(int tc = 1; tc <= 10; tc++) {
            int dump = sc.nextInt();
            int[] numbers = new int[100]; //상자의 가로길이 100 고정

            for(int i = 0; i < 100; i++) {
                numbers[i] = sc.nextInt();
            }
            Arrays.sort(numbers);

            for(int i = 0; i < dump; i++) {
                numbers[0]++;
                numbers[99]--;
                Arrays.sort(numbers);
            }
            ans[tc - 1] = numbers[99] - numbers[0];
        }

        // 출력-------------------------
        for(int i = 0; i < 10; i++) {
            System.out.println("#"+(i+1)+" "+ans[i]);
        }
    }
}
