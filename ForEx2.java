package test.control;

public class ForEx2 {
    public static void main(String[] args) {
        int cnt = 0;
        int j;
        for(int i = 2; i <= 50; i++) {
            for(j = 2; j < i; j++) {
                if(i % j == 0) {
                    break;
                }
            }
            if(i == j) {
                cnt++;
                System.out.print(i + "  ");
            }
        }
        System.out.println("개수 "+cnt );
    }
}
