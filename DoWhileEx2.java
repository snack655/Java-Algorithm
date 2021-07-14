package test.control;

public class DoWhileEx2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println((int) (Math.random() * 26 + 65));
            i++;
        }
    }
}

/*public class DoWhileEx2 {
    public static void main(String[] args) {
        System.out.println(Math.random());             // 0 ~ 0.9999999
        System.out.println((int)(Math.random()*10+1)); // 1 ~ 10 (gab - 1, 시작값)
                        // 0 ~ 0.99999
                        // 0 ~ 0.99999
                        // 1 ~ 10.9999
        System.out.println((int)(Math.random() * 21 + 50)); // 50 ~ 70
                        // 0 ~ 0.999999
                        // 0 ~ 20.99999
                        // 50 ~ 70.9999
                        // 50 ~ 70
        System.out.println((int)(Math.random() * 20 + 51)); // 51 ~ 70
    }
}*/

/*
Math.random() : 0 ~ 0.9999999사이의 난수
 */
