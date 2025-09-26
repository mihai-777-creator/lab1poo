import java.util.Scanner;

import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0;


        int c1 = n / 100;
        int c2 = (n / 10) % 10;
        int c3 = n % 10;

        if (c1 % 2 != 0) c++;
        if (c2 % 2 != 0) c++;
        if (c3 % 2 != 0) c++;

        System.out.println(c);
    }

}
