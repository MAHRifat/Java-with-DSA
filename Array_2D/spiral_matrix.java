package Array_2D;
import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args) {
        int nums[][] = new int[3][2];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int start_r_i = 0;
        int end_r_i = nums.length - 1;
        int start_c_i = 0;
        int end_c_i = nums[0].length - 1;


        
        while (start_r_i <= end_r_i && start_c_i <= end_c_i) {
            // top
            for(int j=0;j<=end_c_i;j++){
                System.out.print(nums[start_r_i][j]);
            }

            // right
            for(int i=start_r_i+1;i<=end_r_i;i++){
                System.out.print(nums[i][end_c_i]);
            }

            // bottom
            for(int j=end_c_i-1;j>=0;j--){
                if(start_r_i == end_r_i){
                    break;
                }
                System.out.print(nums[end_r_i][j]);
            }

            // left
            for(int i=end_r_i-1;i>start_r_i+1;i--){
                if(start_c_i == end_c_i){
                    break;
                }
                System.out.print(nums[i][start_c_i]);
            }

            start_c_i++;
            end_c_i--;
            start_r_i++;
            end_r_i--;
        }

    }
}
