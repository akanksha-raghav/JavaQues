import java.util.Scanner;
public class Condition{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int age = obj.nextInt();
if(age>=18){
System.out.println("You can Vote!");
} else {
System.out.println("You can't vote");
}
}
}