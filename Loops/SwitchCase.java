public class SwitchCase{
    public static void main(String[] args) {
        int days = 2;
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Happy Day");
                break;
        }
    }
}