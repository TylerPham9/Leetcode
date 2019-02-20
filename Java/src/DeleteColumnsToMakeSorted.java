import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] A) {
        int len = A[0].length();
        String[] res = new String[len];
        Arrays.fill(res, "");
        for (String word: A){
            for(int i = 0; i < len; i++){
                res[i] += word.charAt(i);
            }
        }
        Set<Integer> D = new HashSet<Integer>();

        for (int i = 0; i < len; i++){
            for(int j = 0; j < res[i].length()-1; j++){
                if (res[i].charAt(j) > res[i].charAt(j+1)){
                    D.add(i);
                }
            }
        }


        System.out.println(Arrays.toString(res));
        return D.size();
    }

    public static void main(String[] args){
        DeleteColumnsToMakeSorted s = new DeleteColumnsToMakeSorted();
        String[] input = {"cba", "daf", "ghi"};
        System.out.println(
                s.minDeletionSize(input));
    }
}