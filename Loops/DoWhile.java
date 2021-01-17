import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        do{
            System.out.print(n);
            n++;
        }while(n>10);
    }
}
