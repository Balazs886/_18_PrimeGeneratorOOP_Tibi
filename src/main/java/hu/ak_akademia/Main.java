package hu.ak_akademia;

public class Main {
    public static void main(String[] args) {
        Series series = new PrimeGenerator();
        new Environment(series).run();
    }
}
