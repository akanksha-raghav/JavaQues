import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = obj.nextInt();
        int number=1;
        for(int i=1;i<=n;i++){
            // spaces n-i
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(number++ +"  ");
            }
            System.out.println();
        }
    }
}