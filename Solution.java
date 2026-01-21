import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while (i <= n) {
            i++;
        }
        return nums[n / 2];
    }
}

public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = { 3, 2, 3 };
    System.out.println(sol.majorityElement(nums)); // Output: 3
}
