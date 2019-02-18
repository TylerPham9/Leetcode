class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        int lastDigit;
        while (x != 0) {
            lastDigit = x % 10;
            result = (result * 10) + lastDigit;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
    public static void main(String[] args){
        ReverseInteger s = new ReverseInteger();
        System.out.println(s.reverse(1534236469));
    }
}