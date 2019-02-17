import java.util.Arrays;

class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++){
//            System.out.println("Original");
//            System.out.println(Arrays.toString(A[i]));
//            System.out.println(Arrays.toString(A[i]^1));

            for(int j = 0; j < (A[i].length+1)/2; j++){
                int temp = A[i][j] ^ 1;
                A[i][j] = A[i][A.length-j-1] ^1;
                A[i][A.length-j-1] = temp;
            }
        }

        return A;
    }
    public static void main(String[] args){
        FlippingAnImage s = new FlippingAnImage();
        int[][] result = s.flipAndInvertImage(
                new int[][] {{1,1,0}, {1,0,1}, {0,0,0}});
        System.out.println(Arrays.deepToString(result));
    }
}
