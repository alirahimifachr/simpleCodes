/* Fn = Fn-1 + Fn-2 + ...  for n >= 3
   f1 = f2 = 1 
*/

public class Fibonacci{
    public static int fibo(int n){
        if(n <= 2 ){
            return 1;
        }else {
            return fibo(n-1) + fibo(n-2) ;
        }
    }


    public static void main(String[] args){
        int x = 7;
        System.out.println("f(" + x + ") >> " + fibo(x)); 
    }
}