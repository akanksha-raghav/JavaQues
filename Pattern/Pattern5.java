import java.util.Scanner;
public class Pattern5{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = obj.nextInt();
        for(int i=1;i<=n;i++){
            // for spaces - we have spaces in each row
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            // for stars = we have (i) stars in each row
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}