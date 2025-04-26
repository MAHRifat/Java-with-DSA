package String;

public class shortest_path {
    public static void main(String[] args) {
        // Given a rute containing 4 directions (E,W,N,S), find
        // the shortst path to reach destication
        // wneenesennn

        String path = "WNEENESENNN";
        int x = 0;
        int y = 0;

        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'W'){
                x--;
            }else if(path.charAt(i) == 'E'){
                x++;
            }else if(path.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }

        double shortest_path = Math.sqrt(x*x + y*y);

        System.out.println(shortest_path);
    }
}
