package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            for (int j = 1; j < nums.length - 1; j++) {
                nums[nums.length - j] = nums[nums.length - j - 1];
            }
            nums[1] = temp;
        }
    }

    private static void shift(int[] nums) {
        int tmp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = tmp;
    }
}
