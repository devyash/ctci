package com.company;

public class recursion_8_3 {
    public static void main(String[] args) {

        int[] set = {1, 2, 3};
        subset(set);
    }

    static void subset(int[] set) {
        for (int i = 0; i <= set.length; i++) {
            boolean[] ifPrint = new boolean[set.length];
            subset(set, ifPrint, 0, i);
        }
    }

    static void subset(int[] set, boolean[] ifPrint, int start, int remain) {
        if (remain == 0) {
            System.out.print("{");
            for (int i = 0; i < ifPrint.length; i++) {

                if (ifPrint[i]) {
                    System.out.print(" " + set[i]);
                }
            }
            System.out.print(" }\n");

        } else {
            if (start + remain > set.length) {
            } else {
                for (int i=start; i<set.length;i++)
                if(!ifPrint[i]){
                    ifPrint[i] = true;
                    subset(set, ifPrint, i+1, remain-1);
                    ifPrint[i] = false;
                }

            }

        }

    }
}
