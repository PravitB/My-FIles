// 14. Consider a "Binary to Decimal" Number conversion system which only accepts binary number as Input.

class WrongNumberFormat extends Exception {
    WrongNumberFormat(String message) {
        super(message);
    }
}

public class BinaryToDecimal {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a binary number");
            return;
        }

        try {
            String binary = args[0];
            validateBinary(binary);
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Binary " + binary + " = Decimal " + decimal);

        } catch (WrongNumberFormat e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid binary number format");
        }
    }

    static void validateBinary(String binary) throws WrongNumberFormat {
        for (char ch : binary.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new WrongNumberFormat("Input contains non-binary digit: " + ch);
            }
        }
    }
}
