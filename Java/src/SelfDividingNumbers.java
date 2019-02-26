import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();


        for (int i = left; i <= right; i++) {
            if (i%10 != 0) {
                List<Integer> digits = new ArrayList<>();
                int tempi = i;
                while (tempi > 0) {

                    digits.add(tempi % 10);
                    tempi = tempi / 10;
                }
                if (!digits.contains(0)) {
                    boolean selfDividing = true;
                    for (int j : digits) {
                        if (i % j != 0) {
                            selfDividing = false;
                        }
                    }
                    if (selfDividing) {
                        result.add(i);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        SelfDividingNumbers s = new SelfDividingNumbers();
        System.out.println(s.selfDividingNumbers(100, 103));

    }
}
