package leetcode;

/**
 * Created by CHLaih on 2018/8/30.
 */
public class NumberUtils {
    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     *你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
     *
     * */
    public int[] twoSum(int[] nums, int target) {
        int[] numbers = new int[2];
        int[] numscopy = nums;
        for(int i=0;i < nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+numscopy[j]==target){
                    numbers[0]=i;
                    numbers[1]=j;
                }
            }
        }
        return numbers;
    }
    /*
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * */


/*
* 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
* */
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            if(x != 0 && x % 10 == 0){
                return false;
            }
            int tamp = 0;
            while(x>tamp){
                tamp = tamp * 10 + x % 10;
                x /= 10;
            }
            return tamp==x || x == tamp/10;
        }
    }

    /*
    *输入: 10
     输出: false
     解释: 从右向左读, 为 01 。因此它不是一个回文数。
     输入: -121
     输出: false
     解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     输入: 121
     输出: true
    * */


    /*
   给定一个字符串，找出不含有重复字符的最长子串的长度。
   例如：
    输入: "abcabcbb"
    输出: 3
    解释: 无重复字符的最长子串是 "abc"，其长度为 3。
    输入: "bbbbb"
    输出: 1
    解释: 无重复字符的最长子串是 "b"，其长度为 1。
    输入: "pwwkew"
    输出: 3
    解释: 无重复字符的最长子串是 "wke"，其长度为 3。
         请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
    * */
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        String temp = "";
        for(int i = 0;i < s.length();i++){
            for(int j = i; j < s.length(); j++) {
                if (!temp.contains(s.charAt(j) + "")) {
                    temp += s.charAt(j);
                    if (temp.length() > result) {
                        result = temp.length();
                    }
                } else {
                    temp = "";
                    break;
                }
            }
        }
        return result;
        /**参考答案
         * int n = s.length(), ans = 0;
         int[] index = new int[128]; // current index of character
         // try to extend the range [i, j]
         for (int j = 0, i = 0; j < n; j++) {
         i = Math.max(index[s.charAt(j)], i);
         ans = Math.max(ans, j - i + 1);
         index[s.charAt(j)] = j + 1;
         }
         return ans;
         * */
    }
}
