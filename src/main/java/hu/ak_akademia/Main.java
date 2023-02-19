package hu.ak_akademia;

public class Main {
    public static void main(String[] args) {
//        Series series = new PrimeGenerator();
        Series series = new NormalNumberGenerator();
        Environment environment = new Environment(series);
        environment.run();
    }
}
