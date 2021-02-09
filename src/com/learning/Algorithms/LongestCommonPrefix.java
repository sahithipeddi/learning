package com.learning.Algorithms;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
//        String strs[] ={"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
            if (strs.length == 0) return "";
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++)
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            return prefix;
    }

    /* public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        int min_length = Integer.MAX_VALUE;
        for (String str:
             strs) {
            min_length = Math.min(min_length, str.length());}
            int low = 1;
            int high= min_length;
            while (low< high){
                int middle = (low + high)/2;
                if(isCommonPrefix(strs, middle))
                    low = middle +1;
                else
                    high = middle -1;
            }
         if(low== 1 && high == 1)  {
             return "";
         }
        return strs[0].substring(0, (low + high) / 2);
    }

    public static boolean isCommonPrefix(String[] strs, int length) {
        String str1 = strs[0].substring(0, length);
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(str1))
                return false;
        }
        return true;
    }*/
}
