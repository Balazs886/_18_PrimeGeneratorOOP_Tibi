package hu.ak_akademia;

public class Environment {
    private Series generator;

    public Environment(Series generator) {
        this.generator = generator;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (generator.isHasNextStep()) {
                System.out.println(generator.nextStep());
            }
        }
    }
}
