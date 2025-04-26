package String;

public class string_compression {
    public static void main(String[] args) {
        String s = "aaaabcrrrrrg";
        StringBuilder sb = new StringBuilder("");

        for(int i =0;i<s.length();i++){
            Integer count = 1;
            while (i<s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
                count++;
                i++;
            }
            if(count > 1){

                sb.append(s.charAt(i)+count.toString());
            }else{
                sb.append(s.charAt(i));
            }

        }

        System.out.println(sb);

    }
}
