package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int[] NUMBERS = new int[12];

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
            return -1;
        return NUMBERS[totalNumbers];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[totalNumbers--];
    }

}
