package Array;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // create array
        int ar[] = {12,3,45,3};
        
        int marks[] = new int[5];

        //input data/value
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        
        // access array value
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
}
