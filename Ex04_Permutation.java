package test.array2;

public class Ex04_Permutation {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        permutation(arr, 0, n, 3); // 데이터, 깊이, 데이터 갯수(n), 뽑을 수(r)
        System.out.println("------------------");
        permutation_visit(arr,output, visited, 0, n, 2);
    }
    public static void permutation_visit(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for(int i = 0; i < n; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation_visit(arr, output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

    public static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }
        for(int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }
    public static void swap(int[]arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    //출력-------------------------------
    public static void print(int[] arr, int r) {
        for(int i = 0; i < r; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
