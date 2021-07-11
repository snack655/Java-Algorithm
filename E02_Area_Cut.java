package test.sw2;

/*[문제] 영역자르기
        둘리는 분할된 영역 중 가장 큰 영역을 신청하여 많은 농작물을 재배하려고 한다.
        주말농장의 밭 분할 영역 중 가장 큰 영역의 넓이를 알고자 한다.
        입력으로 밭의 가로 세로 길이, 그리고 분할 할 구분선들이 주어질 때,
        가장 큰 영역의 넓이가 몇 제곱미터(m2)인지를 구하는 프로그램을 작성하시오

        [입력]
        첫째 줄에는 밭의 가로와 세로의 길이가 차례로 자연수로 주어진다.
        (가로와 세로의 길이는 최대 100m이다)
        둘째 줄에는 칼로 분할 해야 하는 구분선의 개수가 주어진다.
        세째 줄 부터 마지막 줄까지 한 줄에 구분선이 하나씩 아래와 같은 방법으로 입력된다.
        가로로 자는 구분선은 0과 구분선 번호가 차례로 주어지고, 세로로 자르는 구부선은
        1과 구분선 번호가 주어진다 .입력되는 두 숫자 사이에는 빈칸이 하나씩 있다.

        [출력]
        가장 큰 영역의 넓이를 단위 없이 출력한다.
        ---------------------------------------------------------------------------------------------------------------
        [입력 예시 1]
        10 8
        3
        0 3
        1 4
        0 2
        [출력 1]
        30

        [입력 예시 2]
        50 50
        4
        0 45
        0 30
        0 29
        0 48
        [출력 2]
        1450*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class E02_Area_Cut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ") ;
        int x = Integer.parseInt(st.nextToken()); //가로 길이(x)
        int y = Integer.parseInt(st.nextToken()); //세로 길이(y)

        int n = Integer.parseInt(br.readLine()); // 3

        ArrayList<Integer> arrX = new ArrayList<>();
        ArrayList<Integer> arrY = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," "); // 0 3, 1 4, 0 2
            int temp = Integer.parseInt(st.nextToken());       // 0    1    0

            if(temp == 0) {
                arrY.add(Integer.parseInt(st.nextToken())); // 3
            } else {
                arrX.add(Integer.parseInt(st.nextToken())); // 4
            }
        }
        arrX.add(0); // 시작점
        arrX.add(x); // 종료점
        arrY.add(0);
        arrY.add(y);

        Collections.sort(arrX); // 0 4 10
        Collections.sort(arrY); // 0 2 3 8

        //연속된 두점 사이의 차이를 구해서 최대값을 계산
        /*int maxX = 0;
        for(int i = 1; i < arrX.size(); i++) {
            if(maxX < arrX.get(i) - arrX.get(i - 1)) {
                maxX = arrX.get(i) - arrX.get(i - 1);
            }
        }

        int maxY = 0;
        for(int i = 1; i < arrX.size(); i++) {
            if(maxY < arrY.get(i) - arrY.get(i + 1)) {
                maxY = arrY.get(i) - arrY.get(i + 1);
            }
        }
        System.out.println(maxX * maxY);*/

        int gapMaxX = 0;
        int gapMaxY = 0;
        for(int i = 0; i < arrX.size() - 1; i++){
            int gap = arrX.get(i + 1) - arrX.get(i);
            if(gap > gapMaxX) gapMaxX = gap;
        }
        for(int i = 0; i < arrY.size() - 1; i++){
            int gap = arrY.get(i + 1) - arrY.get(i);
            if(gap > gapMaxY) gapMaxY = gap;
        }

        System.out.printf("%d", gapMaxX * gapMaxY);
    }
}
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(0);
        list.add(10);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);*/

