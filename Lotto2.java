package test.control;

public class Lotto2 {
    public static void main(String[] args) {
        int[][] num = new int[5][6];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 6; j++) {
                num[i][j] = (int)(Math.random() * 45 + 1);
            }
        }
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int v = 0; v < 6; v++) {
                    if (j == v) {
                        continue;
                    } else if (num[i][j+1] == num[i][j]) {
                        num[i][j] = (int)(Math.random() * 45 + 1);
                    }
                }
            }
        }
        for(int k = 0; k < 5; k++) {
            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {
                    if (num[k][i] > num[k][j]) { //오름차순
                        int tmp = num[k][i];
                        num[k][i] = num[k][j];
                        num[k][j] = tmp;
                    }
                }
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.print((i+1)+"회 : ");
            for(int j = 0; j < 6; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
