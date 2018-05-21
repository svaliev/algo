package com.learning.dp;

import org.junit.Assert;

public class RangeSum {

    private int[][] cache;

    public RangeSum(int[] nums) {
        this.cache = new int[nums.length][nums.length];
        for (int x = 0; x < nums.length; x++) {
            cache[x][x] = nums[x];
        }
        for (int j = 1; j < nums.length; j++) {
            for (int i = 0; i < j; i++) {
                cache[i][j] = cache[i][j-1] + cache[j][j];
            }
        }
    }

    public int sumRange(int i, int j) {
        return cache[i][j];
    }

    public static void main(String[] args) {
        RangeSum rangeSum = new RangeSum(new int[]{-2, 0, 3, -5, 2, -1});
        Assert.assertEquals(1, rangeSum.sumRange(0, 2));
        Assert.assertEquals(-2, rangeSum.sumRange(2, 3));
        Assert.assertEquals(-2, rangeSum.sumRange(0, 5));
    }
}


