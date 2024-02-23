package HSE_Day4;

import java.util.Scanner;

public class N1 {
    static int n;
    static int[] masks;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int m = scan.nextInt();

        masks = new int[n];
        for(int i = 0; i < m; i++) {
            int node1 = scan.nextInt() - 1;
            int node2 = scan.nextInt() - 1;
            masks[node1] |= (1 << node2);
            masks[node2] |= (1 << node1);
        }

        System.out.println(rec(0, 0) - 1);
    }
    static int rec(int index, int set) {
        if(index == n)
            return 1;

        int addUp = 0;
        if((set & masks[index]) == 0)
            addUp = rec(index + 1, (set | (1 << index)));

        return rec(index + 1, set) + addUp;

    }
}