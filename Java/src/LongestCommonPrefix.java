public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int i = 0;
        while (i < strs.length) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
            i++;
        }

        return prefix;
    }
    public static void main(String[] args) {
        LongestCommonPrefix s = new LongestCommonPrefix();
        String[] input = {"flower", "flow", "flight"};
        System.out.println(s.longestCommonPrefix(input));

    }
}
