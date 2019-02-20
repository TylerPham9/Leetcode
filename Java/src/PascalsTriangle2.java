
import java.util.Arrays;
import java.util.List;

class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        Integer[] row = new Integer[rowIndex+1];
        Arrays.fill(row, 0);
        row[0] = 1;


        for (int i = 1; i <= rowIndex; i++){
            for (int j = i; j > 0; j--){
                row[j] = row[j] + row[j-1];
            }

        }
        return Arrays.asList(row);

    }

    public static void main(String[] args){
        PascalsTriangle2 s = new PascalsTriangle2();
        System.out.println(s.getRow(3));

    }
}
