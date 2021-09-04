package test.basic;

/* [문제] Scanner 또는 BufferedReader를 이용하시오. 데이터를 입력받아 switch문으로 다음과 같이 출력하시오
(입력데이터)
홍길동 A

(출력데이터)
홍길동은 A학점 입니다
등급은 Gold입니다

(조건)
A는 Gold
B,C는 Silver
나머지는 Bronze
*/

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char cre = sc.next().charAt(0);
        sc.nextLine(); // '엔터'를 처리
        String grade;

        //System.out.println(name+"  "+grade);
        switch (cre) {
            case 'A':
                grade = "Gold";
                break;
            case 'B':
            case 'C':
                grade = "Silver";
                break;
            default:
                grade = "Bronze";
        }
        System.out.println(name + "은 " + cre + "학접 입니다.");
        System.out.println("등급은 " + grade + "입니다.");
    }
}