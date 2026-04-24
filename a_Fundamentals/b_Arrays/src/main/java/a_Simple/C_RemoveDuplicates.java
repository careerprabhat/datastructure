package a_Simple;

public class C_RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);

        // Print the modified array up to the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 1; // Start from the second element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
