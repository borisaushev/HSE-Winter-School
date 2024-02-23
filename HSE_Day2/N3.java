package HSE_Day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class N3 {
    static int[] arr;
    static HashMap<Integer, Integer> map;
    static int S;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        S = scan.nextInt();
        arr = new int[scan.nextInt()];
        map = new HashMap<>(arr.length);

        for(int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();

        System.out.println(rec(0, 0));
    }

    static int max = 0;
    static int rec(int w, int i) {
        if(map.containsKey(w))
            return map.get(w);
        if(w > S)
            return 0;
        if(i >= arr.length)
            return w;
        max = Math.max(rec(w + arr[i], i+1), rec(w, i+1));
        map.put(w, max);
        return max;
    }
}
