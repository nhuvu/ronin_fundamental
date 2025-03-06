public class Exam02 {
    /**
     * Viết chương trình đảo ngược string a. Ví dụ "abc" -> "cba".
     *Input: Nhập vào xâu a = "o1YL9F6TIEHt2kqnIB6ZD8mcx6Qk6cCs31miF1kbCsiiP71kfmbbkThJXFYDElVZfESZWqgyCxk3GozgdtxOglgoEfmt60xGAHbt".
     *Output: In ra ký tự của vị trí index = 39 của string a sau khi đảo ngược. (E)
     * */
    public static void main(String[] args) {
        String a = "o1YL9F6TIEHt2kqnIB6ZD8mcx6Qk6cCs31miF1kbCsiiP71kfmbbkThJXFYDElVZfESZWqgyCxk3GozgdtxOglgoEfmt60xGAHbt";
        String reverse = new StringBuilder(a).reverse().toString();
        for(int i = 0; i < reverse.length(); i++){
            System.out.println(reverse.charAt(39));
            break;
        }
    }
}
