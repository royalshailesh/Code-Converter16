import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> history = new ArrayList<>();

    public double add(double a, double b) {
        double result = a + b;
        history.add(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        history.add(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        history.add(result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.err.println("Error: Division by zero!");
            return 0;
        }
        double result = a / b;
        history.add(result);
        return result;
    }

    public void printHistory() {
        System.out.println("Calculation History:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }

    public void clearHistory() {
        history.clear();
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Simple Calculator Program");
        System.out.println("=========================");

        double result1 = calc.add(10, 5);
        System.out.println("10 + 5 = " + result1);

        double result2 = calc.subtract(20, 8);
        System.out.println("20 - 8 = " + result2);

        double result3 = calc.multiply(6, 7);
        System.out.println("6 * 7 = " + result3);

        double result4 = calc.divide(100, 4);
        System.out.println("100 / 4 = " + result4);

        System.out.println();
        calc.printHistory();
    }
}