import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = obj.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("    ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}