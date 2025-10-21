public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(5, 3);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10,2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        AdvancedCalculator calc_div = new AdvancedCalculator();
        calc_div.setNumbers(10,2);
        calc_div.divide();
        calc_div.displayResult("/");

        ScientificCalculator calc_sci = new ScientificCalculator();
        calc_sci.setNumbers(5);
        calc_sci.square();
        calc_sci.displayResult("^");

    }
}