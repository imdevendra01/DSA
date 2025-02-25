class NumberOfSubarraysOddSum {
    public static void main(String[] args) {
        NumberOfSubarraysOddSum obj = new NumberOfSubarraysOddSum();
        System.out.println(obj.numOfSubarrays(new int[]{1, 3, 5}));
    }

    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        int ans = 0, odd = 0, even = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum % 2 == 1) {
                ans = (ans + even) % MOD;
                odd++;
            } else {
                ans = (ans + odd) % MOD;
                even++;
            }
        }
        return ans;
    }
}
