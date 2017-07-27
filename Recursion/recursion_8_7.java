package com.company;

public class recursion_8_7 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(makechange(n, 25));
    }

    static int makechange(int n, int demon){
        int ways = 0;
        int next_demon = 0;
        switch (demon){
            case 25:
                next_demon = 10;
                break;
            case 10:
                next_demon = 5;
                break;
            case 5:
                next_demon = 1;
                break;
            case 1:
                return 1;
        }
        for(int i=0; i*demon <= n ; i++){
            ways += makechange(n-i*demon, next_demon);
        }
        return ways;
    }
}
