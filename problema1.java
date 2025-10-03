import java.util.Scanner;

public  class problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[1000];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(t[i] + " ");
            }
        }
        System.out.println();


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(t[i] + " ");
            }
        }


    }
}
