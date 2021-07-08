package test.control;

/*[문제] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램(Math 를 이용)

[출력]
*** 숫자 맞추기 게임을 시작합니다 ***
숫자 입력: 50
컴퓨터의 숫자가 더 큽니다.

숫자 입력: 90
컴퓨터의 숫자가 더 작습니다.
      :

숫자 입력: 83
축하합니다.xx번 만에 맞추셨습니다.

한번 더 할까요(Y/y): n
**수고 하셨습니다 **
*/

import java.util.Scanner;

// 10 ~ 99 random
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cnt = 0;
        char onemore;
        System.out.println("*** 숫자 맞추기 게임을 시작합니다 ***");
        num = (int)(Math.random()*90+10);

        while(true) {
            int ans;
            System.out.print("숫자 입력 : ");
            cnt++;
            ans = sc.nextInt();
            if(num > ans) {
                System.out.println("컴퓨터의 숫자가 더 큽니다.");
            } else if (num < ans){
                System.out.println("컴퓨터의 숫자가 더 작습니다.");
            }
            else if(num == ans) {
                System.out.println("축하합니다."+cnt+"번 만에 맞추셨습니다.\n");
                System.out.print("한번 더 할까요(Y/N) : ");
                onemore = sc.next().charAt(0);
                if(onemore == 'N') {
                    System.out.println("**수고 하셨습니다**");
                    break;
                }
                else {
                    System.out.println("\n\n*** 숫자 맞추기 게임을 시작합니다 ***");
                    num = (int)(Math.random()*90+10);
                    cnt = 0;
                }
            }
        }

    }

}
