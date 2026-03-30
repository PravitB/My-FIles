public class lcm {
    public static void main(String[] args) {
        int a = 24, b = 18;
        int g=Math.max(a, b),s=Math.min(a, b);
        int lcm=a*b;
        for (int i=g; i<= a*b;i+=g) {
            if(i%s==0){
                lcm=i;
                break;
            }
        }
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
