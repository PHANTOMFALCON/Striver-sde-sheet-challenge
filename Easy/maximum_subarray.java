package Easy;

public class maximum_subarray {
    public int maxSubArray(int[] nums) {
        int s = 0;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                s = 1;
                break;
            }
        }
        if (s == 1) {
            for (int i = 0; i < nums.length; i++) {
                cs = cs + nums[i];
                if (cs < 0) {
                    cs = 0;
                }
                if (cs > ms) {
                    ms = cs;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (ms < nums[i]) {
                    ms = nums[i];
                }
            }
        }
        return ms;
    }
}