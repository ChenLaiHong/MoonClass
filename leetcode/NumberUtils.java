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
    给定一个 32 位有符号整数，将整数中的数字进行反转。
    假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
    * */

}
