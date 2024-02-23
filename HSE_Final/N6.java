package HSE_Final;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class N6 {
    static int[] weight;
    static int[] cost;
    static int totalW, totalC;
    static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        weight = new int[n];
        cost = new int[n];

        for(int i = 0; i < n; i++) {
            weight[i] = scan.nextInt();
            totalW += weight[i];
            cost[i] = scan.nextInt();
            totalC+= cost[i];
        }

        if(totalW % 2 != 0 || totalC % 2 != 0) {
            System.out.println("NO");
            return;
        }

        if(rec(0, 0, 0, 0)) {
            System.out.println("YES");
            String str = new StringBuilder(Integer.toBinaryString(result)).reverse().toString();
            for(int i = 0; i < str.length(); i++)
                if(str.charAt(i) == '1')
                    System.out.print((i + 1) + " ");
            System.out.println();
        }
        else
            System.out.println("NO");

    }
    static int result;

    static boolean rec(int i, int C, int W, int A) {
        if(i == n && 2*W == totalW && 2*C == totalC) {
            result = A;
            return true;
        }
        if(i == n)
            return false;

        return rec(i+1, C + cost[i], W + weight[i], A|(1<<i)) || rec(i+1, C, W, A);
    }

}
