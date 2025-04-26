package String;

public class string {
    public static void main(String[] args) {
        String str = "abcd";

        // strings are immutable in java 
        System.out.println(str.length());

        // concatenation

        String str2 = "cdef";

        System.out.println(str + str2);

        System.out.println(str.charAt(2));
    }
}
