package String;

public class conver_first_letter_capital {
    public static void main(String[] args) {
        // For a given String convert each the first letter of each 
        // word to uppercase
        String str = "hi, i am rifat";
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' '){
                ch = Character.toUpperCase(str.charAt(i+1));
                sb.append(str.charAt(i));
                sb.append(ch);
                i++;
            }else{
                sb.append(str.charAt(i));
            }
            
        }

        System.out.println(sb);

        
    }
}
