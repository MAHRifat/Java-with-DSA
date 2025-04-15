package Sorting;

public class bubble {
    // in bubble sort largest num move to the last index first
    public static void main(String[] args) {
        int nums[] = {4,52,56,9,6,3,2};

        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
