import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
            int a = temp % 10;
            temp /= 10;
            sum += a;
        }
        System.out.println("Sum of the digits are: "+sum);   
        // to find number of digits of the number given
        int b = (int)Math.log10(n)+1;
        System.out.print("No. of digits "+b);     
    }
}