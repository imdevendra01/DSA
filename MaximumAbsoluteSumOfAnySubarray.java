public class MaximumAbsoluteSumOfAnySubarray {

    public int kadane(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            ans = Math.max(ans, sum);
            if (sum < 0) sum = 0;
        }
        return ans;
    }

    public int maxAbsoluteSum(int[] nums) {
        int ans1 = kadane(nums);

        int[] negNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            negNums[i] = -nums[i];
        }

        int ans2 = kadane(negNums);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        MaximumAbsoluteSumOfAnySubarray obj = new MaximumAbsoluteSumOfAnySubarray();
        int[] nums = { 2,-5,1,-4,3,-2};  // Corrected array initialization
        System.out.println(obj.maxAbsoluteSum(nums));
    }
}
