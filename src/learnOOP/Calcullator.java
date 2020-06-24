package learnOOP;

public class Calcullator implements ICalcullator {
    @Override
    public int addition(int a, int b) {
        return a + b ;
    }

    @Override
    public int substraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

}
