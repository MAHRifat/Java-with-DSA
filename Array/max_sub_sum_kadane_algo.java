package Array;

public class max_sub_sum_kadane_algo {

    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0;i<nums.length;i++){
            curSum = curSum + nums[i];
            if(curSum < 0){
                curSum = 0;
            }
            if(curSum > maxSum){
                maxSum = curSum;
            }
        }
         
        System.out.println(maxSum);
    }
}