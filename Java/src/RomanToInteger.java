import java.util.HashMap;

class RomanToInteger {
    public int romanToInt(String s){

//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i+1)) ){
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        return result;


    }
    public static void main(String[] args) {
        RomanToInteger s = new RomanToInteger();
        System.out.println(s.romanToInt("III"));
        System.out.println(s.romanToInt("IV"));
        System.out.println(s.romanToInt("IX"));
        System.out.println(s.romanToInt("LVIII"));
    }
}
