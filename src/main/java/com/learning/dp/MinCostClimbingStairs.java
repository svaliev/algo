package com.learning.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shamil.valiev on 2/23/2018.
 */
public class MinCostClimbingStairs {

    private int minCostClimbingStairs(int[] cost) {
        int[] min = new int[cost.length + 1];
        min[0] = cost[0];
        min[1] = cost[1];
        for (int i = 2; i < min.length; i++) {
            int stateCost = i < cost.length ? cost[i] : 0;
            min[i] = Math.min(min[i-1] + stateCost, min[i-2] + stateCost);
        }
        return min[min.length - 1];
    }

    @Test
    public void test1() {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int mincost = minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        Assert.assertEquals(6, mincost);
    }

    @Test
    public void test2() {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int mincost = minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20});
        Assert.assertEquals(15, mincost);
    }

    @Test
    public void test3() {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int mincost = minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 9});
        Assert.assertEquals(9, mincost);
    }

}
