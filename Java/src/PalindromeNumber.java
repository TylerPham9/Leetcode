class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        long result = 0;
        int lastDigit;

        int original = x;
        while (x != 0) {
            lastDigit = x % 10;
            result = (result * 10) + lastDigit;
            x = x / 10;
        }


        return result == original;
    }
    public static void main(String[] args) {
        PalindromeNumber s = new PalindromeNumber();
        System.out.println(s.isPalindrome(121));
    }
}
