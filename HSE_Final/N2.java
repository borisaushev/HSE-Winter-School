package HSE_Final;

import java.util.Scanner;

public class N2 {
    static int l;
    static String str1;
    static String str2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        l = scan.nextInt();
        str1 = scan.next();
        str2 = scan.next();

        System.out.println(rec(""));
    }

    static int rec(String cur) {
        if(cur.length() == l)
            return 1;
        String a = cur + "a";
        String b = cur + "b";
        int sum = 0;
        if(!a.contains(str1) && !a.contains(str2))
            sum += rec(a);
        if(!b.contains(str1) && !b.contains(str2))
            sum += rec(b);
        return sum;

    }

}
