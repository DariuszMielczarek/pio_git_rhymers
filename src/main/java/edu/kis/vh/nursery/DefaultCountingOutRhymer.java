package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int arraySize = 12;
    public static int returnValue = -1;
    private final int[] NUMBERS = new int[arraySize];

    public int totalNumbers = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++totalNumbers] = in;
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
