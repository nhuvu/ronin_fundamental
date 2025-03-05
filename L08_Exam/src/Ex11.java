public class Ex11 {
    /**
     * Tìm số nguyên n lớn nhất thỏa mãn n^5 < k
     *Input: k = 10947264
     *Output: In ra giá trị n tìm được (25)
     * */
    public static void main(String[] args) {
        int k = 10947264;
        int n = 1;
        int sum = 1;
        while (true){
            for(int i = 0; i < 5; i++){
                sum *= n;
            }
            if(sum >= k){
                break;
            } else {
                n++;
                sum = 1;
            }
        }
        System.out.println(n - 1);
    }
}
