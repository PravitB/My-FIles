public class fact {
    public static void main(String[] args) {
        int num = 12;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
    
}
