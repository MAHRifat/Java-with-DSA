package Array;

public class array_pass {
    public static void update(int marks[]){   // arrays are passed by referance
        marks[1] = 34;
    }
    public static void main(String[] args) {
        int marks[] = {34,5,221,52};
        System.out.println(marks[1]);
        update(marks);
        System.out.println(marks[1]);
    }
    
}
