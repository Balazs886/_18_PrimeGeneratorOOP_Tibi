package hu.ak_akademia;

public class Environment {
    private Series generator;
    private int iteration = 100;

    public Environment(Series generator) {
        this.generator = generator;
    }

    public void run() {
        for (int i = 0; i < iteration; i++) {
            if (generator.isHasNextStep()) {
                System.out.println(generator.nextStep());
            }
        }
    }

    public Environment setIteration(int iteration) {
        this.iteration = iteration;
        return this;
    }
}
