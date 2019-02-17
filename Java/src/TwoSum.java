import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                result[0] = i;
                result[1] = map.get(complement);
                return result;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        TwoSum s = new TwoSum();
        System.out.println(Arrays.toString(s.twoSum(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(s.twoSum(new int[] {3, 3}, 6)));
    }
}
