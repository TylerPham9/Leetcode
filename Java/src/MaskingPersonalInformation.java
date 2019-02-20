class MaskingPersonalInformation {
    public String maskPII(String S) {

        String result = "";
        if (S.indexOf('@') >= 0 ){
            String[] email = S.split("@");
            String name = email[0].toLowerCase();
            String domain = email[1].toLowerCase();
            String asterisks = "*****";
            String maskedName = name.charAt(0) + asterisks + name.charAt(name.length()-1);
            result = maskedName + "@" + domain;
        } else {
            StringBuilder number = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                switch (S.charAt(i)){
                    case '+':
                    case '-':
                    case '(':
                    case ')':
                    case ' ':
                        break;
                    default:
                        number.append(S.charAt(i));
                }

            }
            if (number.length() == 10){
                result = "***-***-" + number.substring(number.length()-4, number.length());
            } else {
                String[] country = {"", "+*-", "+**-", "+***-"};
                result = country[number.length() - 10] + "***-***-" + number.substring(number.length()-4, number.length());
            }
        }

        return(result);
    }


    public static void main(String[] args){
        MaskingPersonalInformation s = new MaskingPersonalInformation();
        System.out.println(s.maskPII("LeetCode@LeetCode.com"));
        System.out.println(s.maskPII("AB@qq.com"));
        System.out.println(s.maskPII("1(234)567-890"));
        System.out.println(s.maskPII("86-(10)12345678"));


    }
}
