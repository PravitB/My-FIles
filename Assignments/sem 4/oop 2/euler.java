public class euler {
    public static void main(String[] args) {
        float e = 1;
        float factorial = 1;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                factorial = 1;
            } 
            else {
            factorial *= i;
            }
            e += 1 / factorial;
        }
        System.out.println("Approximation of e: " + e);
    }
}
