package String;

public class stringbuilder {
    public static void main(String[] args) {
        // if we want to change the string in loop time complexity almost n^2;
        // to reduce this we use string builder

        StringBuilder sb = new StringBuilder("");

        for(char ch='a';ch<='z';ch++){  // O(26)  but if we do this using string O(26 * 26)
            sb.append(ch);
        }


        System.out.println(sb);
    }
}
