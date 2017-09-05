package edu.orangecoastcollege.cs273.bwegener.tapcounter;

/**
 * Container for a count. Keeps track of how many times an event has occurred.
 * Keeps your little brother busy.
 *
 * @author Brian Wegener
 * @version 1.0
 *
 * Created on 9/5/2017.
 */

public class Counter {

    // Member Variable - data we want to store
    private int mCount;

    /**
     * Instantiates a new Counter object initialized to zero.
     */
    public Counter() {
        mCount = 0;
    }

    /**
     * Gets the current value of the counter.
     * @return The current value of the counter.
     */
    public int getCount() {
        return mCount;
    }

    /**
     * Sets the new value of the counter.
     * @param mCount The new value of the counter.
     */
    public void setCount(int mCount) {
        this.mCount = mCount;
    }

    /**
     * This increases the count by 1.
     * @return the new value of the count.
     */
    public void incrementCount()
    {
        mCount++;
    }
}
