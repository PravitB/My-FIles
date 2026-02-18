public class pat2 {
    public static void main(String[] args) {
        int n = 4;
        int num=1;
        for (int i = 1; i <= n*2; i+=2) {
            for (int j = 1; j <= n*2-i; j+=2) {
                System.out.print("  ");
            }
            num=i/2+1;
            for (int k = 1; k <= i; k++) {
                System.out.print(num+" ");
                if (k<=i/2) {
                    num--;
                }
                else {
                    num++;
                }
            }
            num=1;
            System.out.println();
        }
    }
}
