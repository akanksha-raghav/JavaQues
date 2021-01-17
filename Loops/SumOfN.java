import java.util.Scanner;
public class SumOfN{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = obj.nextInt();
        int sum =0;
        int i = 1;
        for(i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of "+n+" numbers is "+sum);
    }
}