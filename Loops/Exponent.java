import java.util.Scanner;
public class Exponent{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int result = 1;
        for (int i = 1; i<=b ; i++){
            result *= a;
        }
        System.out.println("a^b is " + result);
    }
}