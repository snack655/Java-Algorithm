package test.control;

/*
[문제]아래 결과와 같이 행운의 로또번호 생성기를 만들려고 한다
1. 서로 겹치지 않는 (중복되지 않는) 숫자 6개 생성
2. 각 숫자는 1~45 범위내의 숫자
3. 매번 실행시 다른 숫자 출력
   ---> 랜덤수 : Math사용

[결과]
16 40 21  9 20 11
*/

public class Lotto1 {
    public static void main(String[] args) {
        int[] num = new int[6];
        int i = 0;
        while(i < 6) {
            num[i] = (int)(Math.random() * 45 + 1);
            i++;
        }
        for(int j = 0; j < 6; j++) {
            for(int v = 0; v < 6; v++) {
                if(j == v) {
                    continue;
                }
                else if (num[v] == num[j]) {
                    num[j] = (int) (Math.random() * 45 + 1);
                }
            }
        }
        for(int k=0; k < 6; k++) {
            for(int j=k+1; j < 6; j++) {
                if(num[k] > num[j]) {
                    int tmp = num[k];
                    num[k] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for(int j = 0; j < 6; j++) {
            System.out.print(num[j] + "  ");
        }
    }
}
