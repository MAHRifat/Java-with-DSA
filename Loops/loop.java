package Loops;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        while (i<n) {
            System.out.println("while loop");
            i++;
        }

        for(int j=0 ; j< n ; j++){
            System.out.println("For loop");
        }
        int k = 0;
        do {
            System.out.println("do while loop");
            k++;
        } while (k<n);

        for(int j =0 ;j <=4; j++){
            for(int m=0; m<=4; m++){
                System.out.print("*");
            }
            System.out.println();
        }

        int rev = 0;
        int num = 10899;
        while (num!=0) {
            // System.out.print(num%10);
            rev = (rev * 10) + num%10;
            num = (int)num/10;
        }

        System.out.println(rev);
    }
}
