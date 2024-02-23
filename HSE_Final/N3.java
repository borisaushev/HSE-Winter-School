package HSE_Final;

import java.util.HashSet;
import java.util.Scanner;

public class N3 {
    static int N;
    static int[][] map;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int m = scan.nextInt();
        map = new int[N][N];

        for(int i = 0; i < m; i++) {
            int node1 = scan.nextInt() - 1;
            int node2 = scan.nextInt() - 1;
            map[node1][node2] = 1;
            map[node2][node1] = 1;
        }
        for(int i = 0; i < N; i++)
            rec(i, i, 1 << i);

        System.out.println(count);

    }
    static int count = 0;
    static HashSet<Integer> set = new HashSet<>();
    static void rec(int i, int start, int A) {
        for(int j = 0 ; j < N; j++) {
            if(map[i][j] == 1) {
                if (j == start && A != ((1 << start)|(1 << i))) {
                    if(!set.contains(A)) {
                        count++;
                        set.add(A);
                    }
                    return;
                }
                if ((A & (1 << j)) == 0)
                    rec(j, start, A | (1 << j));
            }
        }
    }

}
