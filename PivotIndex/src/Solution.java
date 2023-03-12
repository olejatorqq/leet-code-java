class Solution {
    public static int pivotIndex(int[] nums) {
        int sum_left = 0;
        int sum_right = 0;

        for (int x : nums) sum_right += x;

        for (int i = 0; i < nums.length; i++){
            sum_left += nums[i];
            if (sum_left == sum_right){
                return i;
            }
            sum_right -= nums[i];
        }

        return -1;
    }
}