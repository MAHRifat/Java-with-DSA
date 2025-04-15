package Array;

public class max_sumarray_sum {
    // use prefix way to calculate
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = i == 0 ?prefix[j] : prefix[j] - prefix[i-1];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
