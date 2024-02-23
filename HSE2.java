package HSE_day1;

import java.util.*;

public class HSE2 {

    static int[] arr;
    static  {
        min();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt())
            System.out.println(arr[scan.nextInt()]);

    }

    static void min() {
        arr = new int[50_001];
        for(int i = 0; i < 8; i++)
            arr[i] = i;

        for(int n = 1; n <= 50_000; n++) {
            int min = n;
            for (int a = 1; a * a * a <= n; a++)
                min = Math.min(min, 1 + arr[n - a * a * a]);
            arr[n] = min;
        }
    }

}
