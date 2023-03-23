import java.util.Scanner;

public class A1093374_0317_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入行列n還有m：");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
