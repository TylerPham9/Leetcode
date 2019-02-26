class PeakIndexinAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length-1;

        while (left < right) {
            int middle = (right + left) / 2;
            if (A[middle] < A[middle+1]){
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public static void main(String[] args){

    }
}
