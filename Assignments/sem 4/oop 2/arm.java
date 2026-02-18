public class arm {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int remainder;
        int result = 0;

        while (num != 0) {
            remainder = num % 10;
            result += Math.pow(remainder, 3);
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
