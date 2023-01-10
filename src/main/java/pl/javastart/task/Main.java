package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        double circleRadius = 2;
        System.out.println("Liczba x: " + x);
        MathOperations operation = new MathOperations();
        boolean isEven = operation.isEven(x);
        System.out.println("Czy liczba x jest parzysta: " + isEven);
        boolean isOdd = operation.isOdd(x);
        System.out.println("Czy liczba x jest nieparzysta: " + isOdd);
        double circleField = operation.circleField(circleRadius);
        System.out.println("Pole kola o promieniu: " + circleRadius + " wynosi: " + circleField);
        int power = operation.power(x);
        System.out.println("Liczba x podniesiona do potegi drugiej: " + power);
    }
}
