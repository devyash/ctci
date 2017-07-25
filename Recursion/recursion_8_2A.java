package com.company;

import java.util.Scanner;

public class recursion_8_2A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = scanner.nextInt();
        System.out.println("enter Y:");
        int y = scanner.nextInt();
        System.out.println("possible paths are " + (fact(x + y - 2)) / (fact(x-1) * (fact(y-1)) )) ;
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n * fact(n-1);
        }
    }
}
