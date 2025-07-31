class CalculatorConundrum {
    public int add(int operand1, int operand2){
        System.out.println("I am adding");
        return operand1 + operand2;
    }
    public int multiply(int operand1, int operand2){
        return operand1 * operand2;
    }
    public int divide(int operand1, int operand2){
        return operand1 / operand2;
    }
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) throw new IllegalArgumentException("Operation cannot be null.");
        if (operation.isBlank()) throw new IllegalArgumentException("Operation cannot be empty.");
        int result;
        try {
            switch (operation) {
                case "+":
                    result = add(operand1, operand2);
                    break;
                case "*":
                    result = multiply(operand1, operand2);
                    break;
                case "/":
                    result = divide(operand1, operand2);
                    break;
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        }
        catch (ArithmeticException ae){
            throw new IllegalOperationException("Division by zero is not allowed", ae.getCause());
        }
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}
