package Array;

public class reverse {
    public static void main(String[] args) {
        int nums[] = {1,4,5,6,7};

        int start = 0;
        int end = nums.length-1;

        while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp; 
            start++;
            end--;
        }

        System.out.println(nums[0]);
    }
}
