/* n! = n x (n-1) x (n-2) x (n-3) x ... x 2 x 1  */

public class Factorial{
    public static int factorialFunc(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return factorialFunc(n-1) * n;
        }
    }
    

    public static void main(String[] args){
        int x = 6;
        System.out.println(x + "! >> " + factorialFunc(x));
    }
}