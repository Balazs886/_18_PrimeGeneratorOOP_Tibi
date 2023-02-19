package hu.ak_akademia;

public class NormalNumberGenerator implements Series {
    private Integer current = 0;

    @Override
    public boolean isHasNextStep() {
        return current < Integer.MAX_VALUE - 1;
    }

    @Override
    public Integer nextStep() {
        current += 1;
        return current;
    }
}
