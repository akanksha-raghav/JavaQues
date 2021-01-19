import java.util.Scanner;
public class MatrixAdd{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the no. of rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
            System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
}