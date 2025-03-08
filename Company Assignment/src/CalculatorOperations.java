
abstract class Operations{
    abstract double addition(double num1,double num2);
    abstract double subtract(double num1,double num2);
    abstract double multiply(double num1,double num2);
    abstract double divide(double num1,double num2);
    abstract double percentage(double num1,double num2);
    abstract double square(double num1);
    abstract double squareRoot(double num1);
}

public class CalculatorOperations extends Operations{
    @Override
    double addition(double num1, double num2) {
        return num1+num2;
    }

    @Override
    double subtract(double num1, double num2) {
        return num1-num2;
    }

    @Override
    double multiply(double num1, double num2) {
        return num1*num2;
    }

    @Override
    double divide(double num1, double num2) {
        if(num2 != 0) return num1/num2;
        else throw new ArithmeticException("Number cannot divided by zero");
    }

    @Override
    double percentage(double num1, double num2) {
        return (num1*num2)/100;
    }

    @Override
    double square(double num1) {
        return num1*num1;
    }

    @Override
    double squareRoot(double num1) {
        if (num1>=0) return Math.sqrt(num1);
        else throw new IllegalArgumentException("Invalid input for square root");
    }
}
