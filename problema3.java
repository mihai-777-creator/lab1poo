import java.util.Scanner;
public class problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double p = 1;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            p *= x;
        }

        double Mg = Math.pow(p, 1.0 / n);
        System.out.printf("%.2f", Mg) ;
    }

}
