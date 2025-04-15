package Sorting;

public class selection {
    public static void main(String[] args) {
        int nums[] = {4,52,56,9,6,3,2};

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
