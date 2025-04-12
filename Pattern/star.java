package Pattern;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // *
        // **
        // ***
        // ****

        for(int i=0; i<n ;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        ****
        ***
        **
        * 
 */
        
        for(int i=n; i>0 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
/*
            1
            12
            123
            1234
*/
        for(int i = 1;i <= n ; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

/*
            A
            BC
            DEF
            GHIJ
 */

        char c= 'A';
        for(int i = 0 ;i <n ;i++){
            for(int j=0 ;j<=i;j++){
                System.out.print(c);
                ++c;
            }
            System.out.println();
        }

        for(int i=1 ; i <= n ; i++){
            for(int j = 1 ; j<=n ; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
