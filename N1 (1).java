package HSE_Day3;

import java.util.*;

public class N1 {
    static int[][] map;
    static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        dist = new int[n];

        int m = scan.nextInt();
        map = new int[n][n];
        for(int i = 0; i < m; i++) {
            int node1 = scan.nextInt() - 1;
            int node2 = scan.nextInt() - 1;
            map[node1][node2] = 1;
            map[node2][node1] = 1;
        }

        for (int i = 0; i < n; i++)
            count(i);

        System.out.println(sum/2);
    }


    static int sum = 0;
    static Queue<Integer> que = new LinkedList<>();
    static int[] dist;
    static Integer cur = 0;
    static void count(int start) {
        Arrays.fill(dist, -1);
        dist[start] = 0;
        que.add(start);

        while((cur = que.poll()) != null)
            for(int i = 0; i < n; i++)
                if(dist[i] == -1 && map[cur][i] == 1) {
                    dist[i] = dist[cur] + 1;
                    sum += dist[i];
                    que.add(i);
                }
    }

}
