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


}
