import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        char ch = obj.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Write a valid operator");
                break;
        }
    }
}