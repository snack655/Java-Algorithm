package test.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
        [문제]성적처리프로그램
        중간고사,기말고사,레포트,출석점수를 BufferedReader로 입력받아서 계산하시오

        조건1)
        (중간+기말)/2  ---> 60%
        과제                   ---> 20%
        출석                   ---> 20%

        조건2)if~else if문이용
        90이상  'A'학점
        80이상 'B'학점
        70이상 'C'학점
        60이상 'D'학점
        나머지 'F'학점

        조건3) switch 이용
        A,B학점  ---->"excellent"
        C,D학점  ---->"good"
        F학점     ---->"poor"
        -------------------------------------------------------------
        [입력화면]
        90 89 99 100   --중간, 기말, 과제, 출석

        [출력화면]
        중간고사 : 90
        기말고사 : 89
        과제점수 : 99
        출석점수: 100

        성적=93.20      <---소수점 2째자리까지
        학점=A
        평가=excellent
 */
public class IfSwitchEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int mid=Integer.parseInt(st.nextToken());
        int fin=Integer.parseInt(st.nextToken());
        int rep=Integer.parseInt(st.nextToken());
        int att=Integer.parseInt(st.nextToken());
        //System.out.println(mid+" "+fin+" "+rep+" "+att);

        char grade;
        String result;
        double avg=(mid+fin)/2*0.6 + rep*0.2 + att*0.2;

        if(avg>=90)			grade='A';
        else if(avg>=80)	grade='B';
        else if(avg>=70)	grade='C';
        else if(avg>=60)	grade='D';
        else				grade='F';

        switch(grade) {
            case 'A':
            case 'B':	result="excellent";	break;
            case 'C':
            case 'D':	result="good";		break;
            default:	result="poor";
        }
        System.out.println("중간고사 : "+ mid);
        System.out.println("기말고사 : "+ fin);
        System.out.println("과제점수 : "+ rep);
        System.out.println("출석점수 : "+ att);

        System.out.printf("\n성적=%.2f\n", avg);
        System.out.println("평가= "+ result);
        System.out.println("학점= "+ grade);
    }
}
