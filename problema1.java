import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] v = new int[n];


        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i += 2) {
            System.out.print(v[i] + " ");
        }
        System.out.println();


        int start = (n % 2 == 0 ? n - 1 : n - 2);
        for (int i = start; i >= 1; i -= 2) {
            System.out.print(v[i] + " ");
        }
    }
}
