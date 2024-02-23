package HSE_Day2;

import java.util.Scanner;

public class N1 {
    static int K, N;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        K = scan.nextInt();

        System.out.println(rec(1, 1, ""));
    }

    static String rec(int n, int k, String res) {
        if(k == K)
            for(int i = n; i <= N; i++)
                System.out.println(res + " " + i);

        for(int i = n; i <= N; i++)
            rec(i + 1, k + 1, res + " " + i);
        return res;
    }

}
