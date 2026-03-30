// 7. Write a program that outputs the name of the capital of the country entered at the command line.

class NoMatchFoundException extends Exception {
    NoMatchFoundException(String message) {
        super(message);
    }
}

public class CountryCapital {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a country name");
            return;
        }

        try {
            String capital = getCapital(args[0]);
            System.out.println("Capital of " + args[0] + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static String getCapital(String country) throws NoMatchFoundException {
        switch (country.toLowerCase()) {
            case "india": return "New Delhi";
            case "usa": return "Washington D.C.";
            case "uk": return "London";
            case "france": return "Paris";
            default: throw new NoMatchFoundException("Capital not found for country: " + country);
        }
    }
}
