public class expo {
    public static void main(String[] args) {
        int base = 2, exponent = 5;
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
