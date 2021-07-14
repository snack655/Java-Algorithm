package test.control;

/*
자료형 : byte(1), short(2), int(4), long(8) => 정수
float(4), double(8) => 실수
boolean => 부울 (true, false)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoWhileEx1 {
    public static void main(String[] args) throws Exception {
        //do - while이용해서 점수를 입력받아 0 ~ 100 사이인 경우를 출력하시오
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score;
        do {
            System.out.println("점수를 입력하시오: ");
            score = Integer.parseInt(br.readLine());
        }while(score < 0 || score > 100);

        System.out.println("당신의 점수는 "+score+"점 입니다");


        //do-while을 이용해서 "I like Algorithm"을 5번 출력 ------
        /*int num = 0;
        do {
            System.out.println("I like Algorithm "+(num+1));
            num++;
        }while(num<5);*/

        // while을 이용해서 "Hello World"를 5번 출력----------
        /*int cnt = 0;

        while(true) {
            cnt++;
            if(cnt <= 5) {
                System.out.println("Hello World");
            } else {
                break;
            }
        }*/
    }
}
