package HSE_Final;

import java.util.Scanner;

public class N1 {
    static int count = 0;
    static int zn;
    static int[][] desk = new int[8][8];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c1 = scan.next();
        int x1 = c1.charAt(0) - 'a';
        int y1 = c1.charAt(1) - 49;
        zn = 1;
        apply(x1, y1, 1);

        String c2 = scan.next();
        int x2 = c2.charAt(0) - 'a';
        int y2 = c2.charAt(1) - 49;
        zn = -1;
        apply(x2, y2, -1);

        System.out.println(count);

    }

    static void apply(int x, int y, int zn) {
        accept(x + 1, y + 2);

        accept(x + 1, y - 2);

        accept(x - 1, y + 2);

        accept(x - 1, y - 2);

        accept(x + 2, y + 1);

        accept(x + 2, y - 1);

        accept(x - 2, y + 1);

        accept(x - 2, y - 1);
    }

    static void accept(int x, int y) {

        if (zn == 1 && exists(x, y)) {
            desk[x][y] = 1;
            count++;
        }
        else if(exists(x, y) && desk[x][y] == 1)
                count--;

    }
    static boolean exists(int x, int y) {
        return x < 8 && x >= 0 && y < 8 && y >= 0;
    }

}
