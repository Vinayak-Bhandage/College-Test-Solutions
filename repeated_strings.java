package Clg_test;

import java.util.*;

class Result {

    public static long repeatedString(String s, long n) {
        long count = 0L, mul = 0L;
        if(s.length() <= n) {  // aab(3) < n = 100
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'a') {
                    count++;
                }
            }
            if(s.length() < n) { // 3 100
                mul = n/s.length(); // 100/3 = 33
                count = count*mul; // 2*33 = 66
                
                long rem = n%s.length(); // 100%3 = 1
                for(int i = 0; i < rem; i++) {
                    if(s.charAt(i) == 'a') {
                        count++; // 67
                    }
                }
            }
            else if(s.length() == n) { // abcaabca(8)  n = 8
                mul = n/s.length();
                count = count*mul;
            }
            return count;
        }
        else if(s.length() > n) { // ababab(6)   n =  3
            s = s.substring(0, (int)n);
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'a')
                    count++;
            }
            return count;
        }
        return count; 
    }
}

public class repeated_strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        System.out.println(Result.repeatedString(s, n));
        in.close();
    }
}
