package HSE_day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HSE3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int SIZE = 150;
        int[] arr = new int[SIZE];
        Arrays.fill(arr, 100);

        Random rand = new Random();
        for(int i = 0; i < 10_000_000; i++) {
            int k1 = rand.nextInt(40);
            int k2 = rand.nextInt(20);
            int k3 = rand.nextInt(7);
            int k4 = rand.nextInt(3);

            int index = k1 + 8 * k2 + 27 * k3 + 64 * k4;
            if(index < SIZE && arr[index] > k1 + k2 + k3 + k4)
                arr[index] = k1 + k2 + k3 + k4;
        }

        for(int i = 0; i < SIZE; i++)
            System.out.println(i + ": " + arr[i]);
        System.out.println();
        /*
        for(int n : arr)
            System.out.print(n + " ");
        */
    }
}
