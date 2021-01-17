import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int i = 3;
        int a = 0;
        int b = 1;
        int fibo = 0;
        for(i=3;i<=n;i++){
            fibo = a+b;
            // print all n fibonacci numbers
            a = b;
            b = fibo;
        }
        System.out.println(fibo); // nth fibonacci
    }
}