import java.util.Scanner;
public class Pallindrome{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int temp = n;
        int reverse = 0;
        while(temp > 0){
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp/=10;
        }
        if(reverse == n){
            System.out.println(n +" is a pallindrome");
        }else{
            System.out.println(n +" is not a pallindrome");
        }
    }
}