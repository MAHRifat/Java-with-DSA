package Array_2D;

public class search_sorted_matrix {
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}
                        };

        int key = 3;

        int row = 0;
        int col = matrix[0].length-1;
        boolean isFound = false;

        while (row < matrix.length && col>=0) {    // staircase search    O(n + m)
            if(matrix[row][col] == key){
                System.out.println("key found at: " + "(" + row + "," + col + ")");
                isFound = true;
                break;
            }else if(matrix[row][col] < key){
                row+=1;
            }else{
                col-=1;
            }
        }

        if(isFound == false){
            System.out.println("Key not found");
        }

    }
}
