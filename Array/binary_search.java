package Array;

public class binary_search {
    public static void binary(int nums[], int num){
        int first = 0;
        int last = nums.length-1;
        while (first<=last) {
            if(nums[(first+last)/2] == num){
                System.out.println("Found the number in the index of : " + (first+last) / 2);
                break;
            }else if(nums[(first+last)/2] < num){
                first = (first+last)/2 + 1;
            }else{
                last = (first+last)/2 -1;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {3,53,2,562,2,6,3,6,10};
        int num = 10;
        int temp;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                }
            }
        }
        
        binary(nums, num);
      
       
    }
}
