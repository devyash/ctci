package com.company;

public class recursion_8_5 {

    public static void main (String[] args)
    {
        int n = 3;
        char[] str = new char[100];
        printParenthesis(str, n);
    }

    static void printParenthesis(char str[], int n){
        if(n > 0)
            printParenthesis(str, 0, n, 0, 0);
        return;
    }

    static void printParenthesis(char[] str, int pos, int n, int open, int close){
        if(close == n){
            for (int i = 0; i< str.length; i++){
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        } else {
            if(open  > close){
                str[pos] = '}';
                printParenthesis(str, pos+1, n, open, close+1);
            }
            if(open < n){
                str[pos] = '{';
                printParenthesis(str, pos+1, n, open+1, close);
            }
        }
    }
}

