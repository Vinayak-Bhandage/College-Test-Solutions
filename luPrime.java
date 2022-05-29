package Clg_test;

import java.util.Scanner;

public class luPrime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int u = in.nextInt();
        boolean flag = true;
        for(int i = l; i <= u; i++) {
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0)
                    flag = false;
            }
            if(flag == true)
                System.out.print(i + " ");
            flag = true;
        }
        in.close();
    }
}
