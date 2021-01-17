import java.util.Scanner;
public class SI{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        int principle = obj.nextInt();
        int rate = obj.nextInt();
        int time = obj.nextInt();
        float interest = (principle*rate*time)/100 ;
        System.out.println(interest);
    }
}