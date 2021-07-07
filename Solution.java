import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] num = new int[10];
        int[] mul = {1,1,1,1,1,1,1,1,1,1};
        while(i < 10) {
            num[i] = sc.nextInt();
            int[] T = new int[2];
            for (int j = 0; j < 2; j++) T[j] = sc.nextInt();
            for (int j = 0; j < T[1]; j++)
                mul[i] *= T[0];
            i++;
        }
        for(int j = 0; j < 10; j++)
            System.out.println("#"+num[j]+" "+mul[j]);

    }
}
