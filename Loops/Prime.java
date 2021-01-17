import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        boolean isPrime = true;
        for(int i =2;i<n;i++){ // to optimise the solution we can use i*i<n
            if(n%i == 0){
                isPrime = false;
            }
        }
        if(n<2){
            isPrime = false;
        }
        System.out.println("Is a prime number " + isPrime);
    }
}