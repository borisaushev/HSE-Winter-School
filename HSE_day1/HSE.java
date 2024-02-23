package HSE_day1;

import java.util.Random;

public class HSE {
    public static void main(String[] args) {

        Random random = new Random();
        int MAX = 10_000_000;

        for(int n = 0; n < 1000; n++) {
            int sum = 0;
            for(int k = 0; k < MAX; k++) {
                int[] p = new int[n];
                for (int i = 0; i < n; i++)
                    p[i] = random.nextInt(1_000);
                sum += count(p, n);
            }
            System.out.println(sum/MAX);
        }

    }

    static int count(int[] p, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && p[j] < p[j - 1]; j--) {
                int temp = p[j];
                p[j] = p[j - 1];
                p[j-1] = temp;
                count++;
            }
        }
        return count;
    }
}
