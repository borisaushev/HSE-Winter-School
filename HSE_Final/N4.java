package HSE_Final;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        int[] arr = new int[100];
        for(int i = 2; i < (x + 100)/2 + 1; i++)
            for(long j = x; j < (x + 100); j++) {
                if(j % i == 0) {
                    int index = (int) (j - x);
                    while(index < 100) {
                        arr[index] += 1;
                        index += i;
                    }
                    break;
                }
            }

        long max = 0;
        int index = 0;
        for(int i = 0; i < 100; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(index + x);

    }

    static void get(int x) {
        int[] arr = new int[x + 100];
        for(int i = 2; i < x+100/2 + 1; i++) {
            int j = i;
            while(j < x+100) {
                arr[j] += 1;
                j+=i;
            }
        }

        int max = 0, index = 0;
        for(int i = x; i < x + 100; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(index + " " + max);

    }

}
