package String;

public class string_compare {
    public static void main(String[] args) {
        String s1 = "Rifat";
        String s2 = "Rifat";
        String s3 = new String("Rifat");

        if(s1 == s2){
            System.out.println("equels 12");
        }
        if(s1 == s3){
            System.out.println("equels 13");
        }

        if(s1.equals(s3)){     // original way to compare
            System.out.println("queel 13");
        }

        System.out.println(s1.substring(0, 4));
    }
}
