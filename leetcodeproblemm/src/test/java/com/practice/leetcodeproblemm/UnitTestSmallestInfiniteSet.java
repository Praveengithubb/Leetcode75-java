package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestSmallestInfiniteSet {

	@Test
    public void testPopSmallest() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        assertEquals(1, set.popSmallest());
        set.addBack(5);
        assertEquals(2, set.popSmallest());
    }

    @Test
    public void testAddBack() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        set.addBack(3);
        set.addBack(1);
        assertEquals(1, set.popSmallest());
        assertEquals(2, set.popSmallest());
        assertEquals(3, set.popSmallest());
    }

}
