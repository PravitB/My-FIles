public class median {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        int n = arr.length;
        
        java.util.Arrays.sort(arr);
        if (n % 2 == 1) {
            System.out.println("Median: " + arr[n / 2]);
        } else {
            System.out.println("Median: " + (arr[n / 2 - 1] + arr[n / 2]) / 2.0);
        }
    }
    
}
