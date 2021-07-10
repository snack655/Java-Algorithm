package test.sw2;

import java.io.FileInputStream;
import java.util.Scanner;

//소금쟁이 중첩
/*
3        // 테스트케이스 수
9 5      // 연못의 크기(N*N), 소금쟁이 수
6 2 2    // 처음 위치(6,2), 오른쪽 방향으로
1 5 1    // 처음 위치(1,5), 아래쪽 방향으로
0 0 2
1 0 1
2 4 2
*/
public class E01_Water_Slider {
    static int N, S;      //연못의 크기, 소금쟁이 수
    static int Answer=0;  //2번뛴 소금쟁이 번호

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/test/sw2/E01_Water_Strider.txt"));
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();   //테스트 케이스 수

        for(int test_case=1; test_case<=T; test_case++) {
            N=sc.nextInt();
            int[][] lake=new int[N][N];  //배열의 크기 N*N

            S=sc.nextInt();                //소금쟁이수
            int[][] strider=new int[S][3]; //r(행),c(열),d(방향)

            for(int k=0; k<S; k++) {
                strider[k][0]=sc.nextInt();  //행위치
                strider[k][1]=sc.nextInt();  //열위치
                strider[k][2]=sc.nextInt();  //방향(1:하,2:우)
            }
            // 이 부분 부터 알고리즘을 구현한다---------------------------------
            Answer=0;
            int k=0;
            for(k=0; k<S; k++) {
                int pi=strider[k][0];   //시작위치 i
                int pj=strider[k][1];   //시작위치 j
                int dir=strider[k][2];  //방향

                if(pi>=0 && pi<N && pj>=0 && pj<N) {
                    if(lake[pi][pj]==1)	break;   //이미 다른 소금쟁이가 뛴 자리라면 빠져나감
                    lake[pi][pj]=1;              //뛴 흔적 저장

                    if(dir==1) {  //아래(1)
                        pi=pi+3;
                        if(pi<N) { //3칸
                            if(lake[pi][pj]==1)	break;
                            lake[pi][pj]=1;
                        }

                        pi=pi+2;
                        if(pi<N) { //2칸
                            if(lake[pi][pj]==1)	break;
                            lake[pi][pj]=1;
                        }

                        pi=pi+1;
                        if(pi<N) { //1칸
                            if(lake[pi][pj]==1)	break;
                            lake[pi][pj]=1;
                        }
                    }else {       //오른(2)
                        pj=pj+3;
                        if(pj<N) { //3칸
                            if(lake[pi][pj]==1)	break;
                            lake[pi][pj]=1;
                        }

                        pj=pj+2;
                        if(pj<N) { //2칸
                            if(lake[pi][pj]==1)	break;
                            lake[pi][pj]=1;
                        }

                        pj=pj+1;
                        if(pj<N) { //1칸
                            if(lake[pi][pj]==1)	break;
                            lake[pi][pj]=1;
                        }
                    }
                } //end if
            }//end for

            if(k < S) Answer=k+1;
            System.out.println("#"+test_case +" " + Answer);

        }//end test_case
    }
}
