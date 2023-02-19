package hu.ak_akademia;

public class PrimeGenerator implements Series {
    private Integer lastItem = 0;
    private Integer nextItem;

    private State state = State.ONGOING;

    @Override
    public Integer nextStep() {
        if (null == nextItem) {
            findNextItem();
        }
        lastItem = nextItem;
        nextItem = null;
        return lastItem;
    }

    @Override
    public boolean isHasNextStep() {
        if (null == nextItem) {
            findNextItem();
        }
        return null != nextItem;
    }

    protected void findNextItem() {
        if (null != nextItem && State.ONGOING.equals(state)) {
            return;
        }
        int current = lastItem;
        for (int i = 0; i < 10000; i++) {
            if (checkPrim(++current)) {
                nextItem = current;
                return;
            }
        }
        state = State.TERMINATED;
    }

    protected boolean checkPrim(int testedNumber) {
        for (int j = 2; j < Math.sqrt(testedNumber); j++) {
            if (testedNumber % j == 0) {
                return false;
            }
        }
        return true;
    }


}
