import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m % n == 0) {
            System.out.println(m + " is a multiple of " + n);
        }
        else{
            System.out.println(m+" is not a multiple of "+n);
        }
    }
}
