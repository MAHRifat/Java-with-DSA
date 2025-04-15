package Array;

public class subarray {
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        int sum = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]);
                    sum = sum + nums[k];
                }
                if(sum < min_sum){
                    min_sum = sum;
                }
                if(sum>max_sum){
                    max_sum = sum;
                }
                System.out.println("  Sum: " + sum);
                sum = 0;
            }
            System.out.println();
        }

        System.out.println("Minimum sum: " + min_sum + " Maximum sum: " + max_sum);
    }
}
