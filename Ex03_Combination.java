package test.array2;

import java.util.Arrays;

public class Ex03_Combination {
    static int[] numbers;
    static int N=4, R=2;

    public static void main(String[] args) {
        numbers = new int[R];
        combination(0,1);
    }

    public static void combination(int cnt,int start) {
        if(cnt == R) {
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for(int i=start; i<=N; i++) {
            numbers[cnt] = i;
            combination(cnt+1,i+1);
        }
    }
}
