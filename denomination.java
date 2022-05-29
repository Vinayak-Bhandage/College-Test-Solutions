package Clg_test;

import java.util.Scanner;

public class denomination {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i = 0, count = 0;
        int arr[] = new int[10];
        while(n != 0) {
            count++;
            arr[i++] = n%10;
            n = n/10;
        }
        for(int j = (count-1); j >= 0; j--) {
            System.out.println(arr[j] + "*" + ((int)Math.pow(10, j)) + " = " + arr[j]*((int)Math.pow(10, j)));
        }
        in.close();
    }
}
