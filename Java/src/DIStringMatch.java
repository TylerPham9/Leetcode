import java.util.Arrays;

class DIStringMatch {
    public int[] diStringMatch(String S) {
        int size = S.length();
        int[] result = new int[size+1];
        int left = 0, right = size;
        for (int i = 0; i < size; i++){
            if (S.charAt(i) == 'I'){
                result[i] = left++;
            } else {
                result[i] = right--;
            }

        }
        result[size] = left;
        return result;
    }
    public static void main(String[] args){
        DIStringMatch s = new DIStringMatch();
        String input = "IDID";
        System.out.println(Arrays.toString(s.diStringMatch(input)));
    }
}
