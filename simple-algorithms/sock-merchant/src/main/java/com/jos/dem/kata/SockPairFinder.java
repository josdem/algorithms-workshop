package com.jos.dem.kata;

/*
John works at a clothing store and he’s going through a pile of socks to find the number of matching pairs.
Given: A collection with socks’ colors 10, 20, 20, 10, 10, 30, 50, 10, 20
Then: Write a function to find out how many pairs you can get.
 */

import java.util.List;

class SockPairFinder {

    public int findPairsBy(List<Integer> colors) {
        return colors.size();
    }
}
