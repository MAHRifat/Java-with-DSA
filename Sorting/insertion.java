package Sorting;

public class insertion {
    public static void main(String[] args) {
        int nums[] = {4,52,56,9,6,3,2};

        for(int i=1;i<nums.length;i++){
            for(int j=i;j>=1;j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else{
                    break;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
