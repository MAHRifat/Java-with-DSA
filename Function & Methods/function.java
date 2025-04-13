public class function {
    public static int  abc(int a, int b){   // parameters / formal parameters
        return a+b;
    }

    public static int factorial(int a){
        if(a ==0 || a == 1){
            return 0;
        }
        int res=1;
        for(int i=1;i<=a;i++){
            res = res*i;
        }
        return res;
    }

    public static int binomialCoefficient(int n, int r){
        return (factorial(n)/(factorial(r)*factorial(n-r)));
    }

    public static void main(String[] args) {
        System.out.println(abc(3,4));    // arguments / actual parameters
        System.out.println(binomialCoefficient(4, 2));
    } 
}
 

// Java always calls by value ->>>>  copy pass t the function

// java not work by call by referance  ->>>>> original copy pass to the function

// function overloading parameter depandent...... not returntype