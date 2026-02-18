public class bindec {
    public static int bindec(int[] bin){
        int decimal = 0;
        int power = 1;

        for (int i = bin.length - 1; i >= 0; i--) {
            decimal += bin[i] * power;
            power *= 2;
        }

        return decimal;
    }
    public static int[] decbin(int n){
        int[] binary = new int[32];
        int index = 0;

        while (n > 0) {
            binary[index++] = n % 2;
            n /= 2;
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = binary[index - 1 - i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] binary = {1, 0, 1, 1};
        int bd = bindec(binary);
        System.out.println("Binary to Decimal: " + bd);
        int[] db = decbin(bd);
        System.out.print("Decimal to Binary: ");
        for (int bit : db) {
            System.out.print(bit);
        }
    }
}