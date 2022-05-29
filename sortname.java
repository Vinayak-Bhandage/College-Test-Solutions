package Clg_test;

import java.util.*;

public class sortname {
    static boolean comp(String f, String s) {
        int len = Math.min(f.length(), s.length()); 
        boolean flag=true;
        if(f.length() > s.length()) // 
            flag = true;
        if(f.length() < s.length()) // 3 4  ram rama
            flag = false;
        for(int i = 0; i < len; i++) {
            if(f.charAt(i) > s.charAt(i)) {
                flag = true;
                break;
            }
            else if(f.charAt(i) < s.charAt(i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        for(int i = 0; i < str.length-1; i++) {
            for(int j = i+1; j < str.length; j++) {
                if(comp(str[i], str[j])) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Sorted Names: ");
        for(int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        in.close();
    }   
}
