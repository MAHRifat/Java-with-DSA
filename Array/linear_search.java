package Array;

public class linear_search {   // linear sort
    public static void main(String[] args) {
        int num[] = {2,1,5,3,6,3,2};
        int temp = 0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if(num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
    }
}
