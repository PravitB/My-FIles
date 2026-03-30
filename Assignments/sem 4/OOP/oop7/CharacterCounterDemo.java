// 4. Write a class that keeps a running total of all characters passed to it (one at a time) and throws an exception if it is passed a non-alphabetic character.

class NonAlphabeticException extends Exception {
    NonAlphabeticException(char ch) {
        super("Non-alphabetic character found: " + ch);
    }
}

class CharacterCounter {
    private int total = 0;

    void addCharacter(char ch) throws NonAlphabeticException {
        if (!Character.isLetter(ch)) {
            throw new NonAlphabeticException(ch);
        }
        total++;
    }

    int getTotal() {
        return total;
    }
}

public class CharacterCounterDemo {
    public static void main(String[] args) {
        CharacterCounter counter = new CharacterCounter();

        try {
            counter.addCharacter('a');
            counter.addCharacter('b');
            counter.addCharacter('1'); // This will throw exception
        } catch (NonAlphabeticException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Total alphabetic characters before exception: " + counter.getTotal());
        }
    }
}
