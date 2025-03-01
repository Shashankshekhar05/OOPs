package Encapsulation;
  class TemperatureConverter {
    private double celsius;

    // Getter for Celsius
    public double getCelsius() {
        return celsius;
    }

    // Setter for Celsius (with validation)
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) { // Absolute zero check
            this.celsius = celsius;
        }
    }

    // Getter for Fahrenheit (calculated, no setter)
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    // Method to update both scales
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5/9;
    }
}
public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.setCelsius(25);
        System.out.println("Fahrenheit: " + converter.getFahrenheit());

        converter.setFahrenheit(77);
        System.out.println("Celsius: " + converter.getCelsius());
    }
}