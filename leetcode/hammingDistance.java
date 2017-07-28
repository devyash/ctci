// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Given two integers x and y, calculate the Hamming distance.

// Note:
// 0 ≤ x, y < 231.

// The logic is very simple.Just exor both the digits and then calulcate the number of ones. 
// The logic below for counting the number of one's is acucaly really intersting
// if a number is not 0, then if we subtract 1 from that number the bits right of it all become 1.
// 11000 -1= 10111 when we AND this with original number only that first 1 converts to 0. Rest remain as it is
// 11000 & 10111 = 10000 This inshort removes one 1. 	

public class Solution {
    public int hammingDistance(int x, int y) {
    int i = x ^ y;
    int count=0;
    while (i != 0) {
        ++ count;
        i = (i-1)& i;
    }
    return count;
    }
}

