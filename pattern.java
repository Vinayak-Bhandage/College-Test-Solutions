/*
4.	Write a program to generate following patterns
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/

package Clg_test;

import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = 1, l = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0)
                l = 1;
            if(i == 1)
                l = 2;
            for(int j = 0; j < i+l; j++) {
                if(j < (i+l)/2)
                    System.out.print(k++ + " ");
                else
                    System.out.print(--k + " ");
            }
            System.out.println();
            k = 1;
            l++;
        }
    }
}
