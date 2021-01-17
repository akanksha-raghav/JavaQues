import java.util.Scanner;
public class Series2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        float sum = 0;
        for(float i=1;i<=n;i++){
            if(i%2 == 0){
                sum -= 1/i;
            }else{
                sum += 1/i;
            }
        }
        System.out.println("Sum of the series is "+ sum);
    }
}