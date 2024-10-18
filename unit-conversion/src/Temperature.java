public class Temperature {
    int unit;
    double value;

    public Temperature(int unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    void celsiusToFahrenheit() {
        System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit.\n", value, (value * 1.8) + 32);    }

    void celsiusToKelvin() {
        System.out.printf("%.2f Celsius é igual a %.2f Kelvin.\n", value, value + 273.15);
    }

    void kelvinToCelsius() {
        System.out.printf("%.2f Kelvin é igual a %.2f Celsius.\n", value, value - 273.15);
    }

    void kelvinToFahrenheit() {
        System.out.printf("%.2f Kelvin é igual a %.2f Fahrenheit.\n", value, ((value - 273.15) * 1.8) + 32);
    }

    void fahrenheitToCelsius() {
        System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius.\n", value, (value - 32) / 1.8);    }

    void fahrenheitToKelvin() {
        System.out.printf("%.2f Fahrenheit é igual a %.2f Kelvin.\n", value, ((value - 32) * 5 / 9) + 273.15);
    }
}
