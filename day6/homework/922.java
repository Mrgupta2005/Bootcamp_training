class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int[] ans = new int[nums.length];

        int even = 0;
        int odd = 1;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] % 2 == 0) {
                ans[even] = nums[fast];
                even += 2;
            } else {
                ans[odd] = nums[fast];
                odd += 2;
            }
        }

        return ans;
    }
}