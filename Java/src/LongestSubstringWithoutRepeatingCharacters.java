import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }
    public static void main(String[] args){
        LongestSubstringWithoutRepeatingCharacters s = new LongestSubstringWithoutRepeatingCharacters();
//        string input = "abcabcbb";
//        int result = s.lengthOfLongestSubstring(new String("abcabcbb"));
        int result = s.lengthOfLongestSubstring(new String("pwwkew"));
        System.out.println(result);
    }

}
