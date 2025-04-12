package Conditional;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you can't vote");
        }

        if(age < 18){
            System.out.println("You can't drive");
        }else if(age > 60){
            System.out.println("your can't drive");
        }else{
            System.out.println("You can drive");
        }
    }
}
