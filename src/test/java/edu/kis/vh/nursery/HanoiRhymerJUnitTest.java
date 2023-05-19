package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerJUnitTest {
    @Test
    public void testReportRejected() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        final int START_TOTAL_REJECTED = 0, EXPECTED_TOTAL_REJECTED = 1;
        int testValue1 = 4, testValue2 = 14;

        int result = hanoiRhymer.reportRejected();
        Assert.assertEquals(START_TOTAL_REJECTED, result);

        hanoiRhymer.countIn(testValue1);
        result = hanoiRhymer.reportRejected();
        Assert.assertEquals(START_TOTAL_REJECTED, result);

        hanoiRhymer.countIn(testValue2);
        result = hanoiRhymer.reportRejected();
        Assert.assertEquals(EXPECTED_TOTAL_REJECTED, result);
    }

    @Test
    public void testCountIn() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        final int START_PEEKABOO_RETURN_VALUE = -1;
        int testValue1 = 4, testValue2 = 2, testValue3 = 10;

        hanoiRhymer.countIn(testValue1);
        int result = hanoiRhymer.peekaboo();
        Assert.assertEquals(testValue1, result);

        hanoiRhymer.countIn(testValue2);
        result = hanoiRhymer.peekaboo();
        Assert.assertEquals(testValue2, result);

        hanoiRhymer.countIn(testValue3);
        result = hanoiRhymer.peekaboo();
        Assert.assertEquals(testValue2, result);
    }
}
