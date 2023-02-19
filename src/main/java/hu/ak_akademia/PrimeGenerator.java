package hu.ak_akademia;

public class PrimeGenerator implements Series {
    private Integer lastItem;
    private Integer nextItem;

    @Override
    public Integer nextStep() {
        return null;
    }

    @Override
    public boolean isHasNextStep() {
        return false;
    }

    static boolean isPrime(int testedNumber) {
        for (int j = 2; j < testedNumber; j++) {
            if (testedNumber % j == 0) {
                return false;
            }
        }
        return true;
    }


}
