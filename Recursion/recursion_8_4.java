package com.company;

public class recursion_8_4 {
        public static void main(String[] args){
            String str = "ABCD";
            int n = str.length();
            permute(str, 0, n-1);
        }

        static void permute(String str, int l, int r){
            if(l==r){
                System.out.println(str);
            } else{
                for (int i=l; i<=r; i++){
                    str = swap(str, l, i);
                    permute(str, l+1, r);
                    str = swap(str, l, i);
                }
            }
        }

        static String swap(String s, int i, int j){
            char[] ch = s.toCharArray();
            char tmp = ch[i];
            ch[i] = ch[j];
            ch[j] = tmp;
            return String.valueOf(ch);
        }
}
