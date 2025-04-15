package Sorting;

public class counting {
    public static void main(String[] args) {
        int nums[] = {4,52,56,9,6,3,2};
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest+1];

        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
