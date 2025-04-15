package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuild {
    public static void main(String[] args) {
        int nums[] = {4,52,56,9,6,3,2};

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

        Integer num[] = {3,566,7,7,8,3,1};
        
        Arrays.sort(num,Collections.reverseOrder());
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
