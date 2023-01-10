package pl.javastart.task;

public class MathOperations {
    boolean isEven(int x) {
        return x % 2 == 0;
    }

    boolean isOdd(int x) {
        return x % 2 == 1;
    }

    double circleField(double circleRadius) {
        return circleRadius * circleRadius * 3.14;
    }

    int power(int x) {
        return x * x;
    }
}
