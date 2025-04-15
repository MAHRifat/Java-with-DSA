package Array_2D;

import java.util.Scanner;

public class diagonal_sum {
    public static void main(String[] args) {
        
         int nums[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int primary_diagonal = 0;
        int secondary_diagonal = 0;

        for(int i=0;i<nums.length;i++){     // O(n^2)
            for(int j=0;j<nums[0].length;j++){
                if(i == j){
                    if(i != nums.length/2){
                        primary_diagonal+= nums[i][j];                        
                    }
                }
                if(i+j == nums.length-1){
                    secondary_diagonal+= nums[i][j];
                }
            }
        }

        System.out.println("Diagonal sum: " + (primary_diagonal+secondary_diagonal));
        
        int sum = 0;

        for(int i=0; i<nums.length;i++){   // O(n)
            // pd
            sum+=nums[i][i];
            // sd
            if(i != nums.length-1-i)
                sum = sum + nums[i][nums.length-i-1];
        }

        System.out.println(sum);
    }
}
