import java.util.Scanner;

public class JavaBasic {
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.print("print\n");
        System.out.println("exit");

        // input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);

        int n = sc.nextInt();
        System.out.println(n);

        /*
        type conversion
            a. type compatible
            b. destination type > source type

        type casting  -> narrowing or explicit conversion
           int marks = (int)(5.44f) 

        type promotion in expressions
            a. Java automatically promotoes each byte, short or char operand to int when
                evaluating an expression
            b. If one operand is long, float  or double the whole expression is promoted
                 to long, float or double respectively.
         */ 



        




    }
}


// javac filename  -> to compile the java file 
// java filename -> to run the code


/*
    JDK > JRE > JVM 
        JDK -> Java Development Kit
        JRE -> Java Runtime Environment
        JVM -> Java virtual Machine

    run
        .java -> compiler -> byte code.class -> JVM -> Native code(computer can underestend only)

        java is portable language .
*/