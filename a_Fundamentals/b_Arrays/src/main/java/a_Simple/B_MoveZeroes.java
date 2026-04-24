package a_Simple;

public class B_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 0, 12};
        moveZeroes(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the elements
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;

                lastNonZeroFoundAt++;
            }
        }
    }
}
