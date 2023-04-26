package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int arraySize = 12;
    private static final int returnValue = -1;
    private final int[] NUMBERS = new int[arraySize];

    private final int  EMPTY_RHYMER_INDICATOR = -1;

    private int totalNumbers = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++totalNumbers] = in;
    }

    public int getTotalNumbers() {
        return totalNumbers;
    }

    public boolean callCheck() {
        return totalNumbers == -1;
    }

    public boolean isFull() {
        return totalNumbers == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return returnValue;
        return NUMBERS[totalNumbers];
    }

    public int countOut() {
        if (callCheck())
            return returnValue;
        return NUMBERS[totalNumbers--];
    }

}
