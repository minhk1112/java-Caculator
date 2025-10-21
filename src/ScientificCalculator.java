public class ScientificCalculator extends AdvancedCalculator {
    // 계산기 v3.0개발
    // 이슈 : https://github.com/minhk1112/java-Caculator/issues/8

    //제곱 연산자로 두 수 연산 완료
    //https://github.com/minhk1112/java-Caculator/issues/9
    private int num3;

    public void setNumbers(int n1) {
        this.num1 = n1;
    }

    public short square() {
        num3 = num1 * num1;
        return (short) num3;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num1 + " = " + num3);
    }
}

