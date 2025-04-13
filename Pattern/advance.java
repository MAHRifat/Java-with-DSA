package Pattern;

public class advance {

    public static void inverted_roteted_half_pyramid(int n){
/*

  *
 **
***

*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j <= n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_number(int n){


/*

12345
1234
123
12
1 

*/
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                if(j <= n-i){
                    System.out.print(j);
                }else{
                    break;
                }
            }
            System.out.println();
        }
    }


    public static void floyds_triangle(int n){

/*
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15

*/
        int m=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m + "  ");
                m++;
            }
            System.out.println();
        }
    }


    public static void tringle0_1(int n){

/*

1
01
101
0101
10101
 
*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){

/*

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 
*/
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n;j++){
                if(j<=i || j>n-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<=i || j>n-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void solid_rhombus(int n){

/*

    *****
   *****
  *****
 *****
*****

*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+(n-i);j++){
                if(j<=n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void hollow_rhombus(int n){

/*

    *****
   *   *
  *   *
 *   *
*****
 
*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void diamond(int n){

/*

       *
      ***
     *****
    *******
    *******
     *****
      ***
       *

       */
        for(int i=1;i<=n/2;i++){
           for(int j=1;j<=n-i;j++){
            System.out.print(" ");
           }
           for(int j=1;j<=i*2-1;j++){
            System.out.print("*");
           }

            System.out.println();
        }
        for(int i=n/2;i>=1;i--){
           for(int j=1;j<=n-i;j++){
            System.out.print(" ");
           }
           for(int j=1;j<=i*2-1;j++){
            System.out.print("*");
           }

            System.out.println();
        }
    }


    public static void main(String[] args) {


        inverted_roteted_half_pyramid(3);
        inverted_half_pyramid_with_number(5);
        floyds_triangle(5);
        tringle0_1(5);
        butterfly(10);
        solid_rhombus(7);
        hollow_rhombus(5);
        diamond(8);

    }
}
