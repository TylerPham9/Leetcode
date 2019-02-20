import java.util.Arrays;

class LongestHarmonious {
    public int findLHS(int[] nums){
        Arrays.sort(nums);

        int result = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] - nums[left] < 1){
                right++;
            } else if (nums[right] - nums[left] == 1){
                result = Math.max(result, right - left + 1);
                right++;
            } else {
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        LongestHarmonious s = new LongestHarmonious();
        int[] input = {1,3,2,2,5,2,3,7};
        System.out.println(s.findLHS(input));
    }
}
