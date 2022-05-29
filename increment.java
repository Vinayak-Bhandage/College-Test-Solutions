package Clg_test;

import java.util.Scanner;

public class increment {
    public static void main(String args[])  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[5];
        int rem = 0, i = 0; 
        while(n != 0) {
            rem = n%10;
            if(rem == 9)
                rem = 0;
            else
                rem++;

            arr[i] = rem;
            n = n/10;
            i++;
        }
        for(int j = 4; j >= 0; j--) {
            System.out.print(arr[j]);
        }
        in.close();
    }
}
