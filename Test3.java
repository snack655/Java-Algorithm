package test.control;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextInt(); // "엔터" 처리

        String[] commonleap = new String[T];
        String[] num = sc.nextLine().split(" ");

        for(int i = 0; i < T; i++) {
            int year = Integer.parseInt(num[i]);
            if(year%4 == 0 && year%100!=0||year%400==0) {
                commonleap[i] = "윤년";
            } else {
                commonleap[i] = "평년";
            }
        }

        //출력-----------------------------------------
        for(int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + commonleap[i]);
        }
    }
}
