// 12. Create two user-defined exceptions named "TooHot" and "TooCold" to check the temperature.

class TooHot extends Exception {
    TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide temperature in Celsius");
            return;
        }

        try {
            double temp = Double.parseDouble(args[0]);
            checkTemperature(temp);
        } catch (TooHot | TooCold e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid number for temperature");
        }
    }

    static void checkTemperature(double temp) throws TooHot, TooCold {
        if (temp > 35) {
            throw new TooHot("Temperature is too hot: " + temp + "°C");
        } else if (temp < 5) {
            throw new TooCold("Temperature is too cold: " + temp + "°C");
        } else {
            double fahrenheit = (temp * 9/5) + 32;
            System.out.println("Normal temperature: " + temp + "°C = " + fahrenheit + "°F");
        }
    }
}
