package String;

public class largest_string {
    public static void main(String[] args) {
        // For a given set of strings, print the largest String
        String strs[] = {"apple","mango","banana"};
        String largest = strs[0];
        for(int i=1;i<strs.length;i++){
            if(largest.compareTo(strs[i]) < 0){
                largest = strs[i];
            }
        }
        System.out.println(largest);
    }
}
