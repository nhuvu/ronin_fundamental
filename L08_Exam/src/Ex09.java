public class Ex09 {
    /**
     * Viết chương trình kiểm tra chuỗi aecoceoaaeceoaaeoceooceaoeoceooceoaaoeceoaecoea có phải là một xâu đối xứng không
     *Input: Một xâu ký tự như trên
     *Output: Nếu xâu trên là xâu đối xứng hãy in ra ký tự thứ 32 trong chuỗi,
     * nếu không hãy in ra ký tự thứ 26 trong chuỗi. Vị trí đầu được gọi là ký tự thứ 1. (e)
     * */
    public static void main(String[] args) {
        String s = "aecoceoaaeceoaaeoceooceaoeoceooceoaaoeceoaecoea";
        if(isPalindrome(s)){
            System.out.println(s.charAt(31));
        }else {
            System.out.println(s.charAt(25));
        }
    }

    public static boolean isPalindrome (String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() -1 - i)){
                return false;
            }
        }
        return true;
    }
}
