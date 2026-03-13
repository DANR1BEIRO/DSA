package leetcode;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * arr: [0,1,0,3,12]
 */

public class MoveZeroes {
    public static int[] arr = {0, 1, 0, 3, 12};

    public static void go(int[] nums) {
        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        while (pointer < nums.length) {
            nums[pointer] = 0;
            pointer++;
        }
        System.out.println(java.util.Arrays.toString(nums));
    }

    public static void main(String[] args) {
        go(arr);
    }
}
