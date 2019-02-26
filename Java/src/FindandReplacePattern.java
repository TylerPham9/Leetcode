import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class FindandReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] patternInt = getIntPattern(pattern);
        List<String> result = new ArrayList<>();
        for (String word: words){
            if (Arrays.equals(patternInt, getIntPattern(word))){
                result.add(word);
            }
        }
        return result;
    }

    public int[] getIntPattern(String pattern){

        HashMap<Character, Integer> map = new HashMap<>();
        int size = pattern.length();
        int[] patternInt = new int[size];

        for (int i = 0; i < size; i++) {
            map.putIfAbsent(pattern.charAt(i), map.size());
            patternInt[i] = map.get(pattern.charAt(i));

        }
        return patternInt;
    }

    public static void main(String[] args){
        FindandReplacePattern s = new FindandReplacePattern();

    }
}
