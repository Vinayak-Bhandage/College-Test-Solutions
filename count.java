package Clg_test;

import java.util.Scanner;

public class count {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        while(n != 0) {
            n = n/10;
            count++;
        }
        System.out.println(count);
        in.close();
    }
}
