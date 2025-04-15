package Array;

public class trapping_rainwater {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int total_water = 0;

        int left_max[] = new int[height.length];
        int right_max[] = new int[height.length];

        left_max[0] = height[0];
        right_max[height.length-1] = height[height.length-1];

        for(int i=1;i<height.length-1;i++){
            if(height[i] < left_max[i-1]){
                left_max[i] = left_max[i-1];
            }else{
                left_max[i] = height[i];
            }
        }


        for(int i=height.length-2;i>0;i--){
            if(height[i] < right_max[i+1]){
                right_max[i] = right_max[i+1];
            }else{
                right_max[i] = height[i];
            }

        }

        for(int i=0;i<height.length;i++){
            if(Math.min(left_max[i], right_max[i]) - height[i] >= 0){
                total_water = total_water + (Math.min(left_max[i], right_max[i]) - height[i]);
            }
        }


        System.out.println(total_water);
    }
}
