import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = obj.nextInt();
        for(int i=1;i<=n;i++){
            // for spaces - we have 2(i-1) spaces in each row
            for(int j=1;j<=(i-1);j++){
                System.out.print("  ");
            }
            // for stars = we have (n-i+1) stars in each row
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}