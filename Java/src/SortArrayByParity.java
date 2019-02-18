import java.util.Arrays;

class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int left = 0;
        int right = A.length - 1;

        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 == 1){
                res[right] = A[i];
                right--;
            } else {
                res[left] = A[i];
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        SortArrayByParity s = new SortArrayByParity();
        int[] input = {3,1,2,4};
        System.out.println(Arrays.toString(s.sortArrayByParity(input)));
    }
}
