package HSE_Day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Timer;

public class N4 {
    static String str;
    static int count = 0;

    public static void main(String[] args) {
        str = new Scanner(System.in).next();
        System.out.println(rec(0, new HashSet<String>()));
    }

    static int rec(int i, HashSet<String> set) {
        if(set.add(str.substring(i))) {
            count++;
            set.remove(str.substring(i));
        }

        for(int x = i + 1; x < str.length(); x++)
            if(set.add(str.substring(i, x))) {
                rec(x, (HashSet<String>) set.clone());
                set.remove(str.substring(i, x));
            }

        return count;
    }

}
