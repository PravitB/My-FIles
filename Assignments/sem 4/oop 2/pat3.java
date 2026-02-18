public class pat3 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int s=0;s<i-1;s++) {
                System.out.print(" ");
            }
            if (i!=n){
                System.out.print(i);
                for (int k = n; k > i; k--) {
                    System.out.print("  ");
                }
                
                System.out.print(i);
            }
            else{
                System.out.print(i+" ");
            }
            
            
            System.out.println();
        }
    }
}
