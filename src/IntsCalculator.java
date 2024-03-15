public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    private int calc(Calculator.Operation operation, int arg0, int arg1) {
        double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(operation)
                .result();
        return (int) result;
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calc(Calculator.Operation.SUM, arg0, arg1);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calc(Calculator.Operation.MULT, arg0, arg1);
    }

    @Override
    public int pow(int a, int b) {
        return calc(Calculator.Operation.POW, a, b);
    }
}
