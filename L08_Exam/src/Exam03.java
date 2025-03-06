public class Exam03 {
    /**
     * Viết chương trình tìm số nguyên tố thứ 500.
     * Input: Một số nguyên n = 500
     * Output: Một số nguyên là số nguyên tố thứ 500 (điền kết quả tìm được vào ô bên dưới) (3571)
     * */
    public static void main(String[] args) {
        int index = 0;
        int start = 1;
        while (true){
            if(index == 500){
                break;
            }
            start++;
            if(isPrime(start)){
                index++;
            }

        }
        System.out.println(start);
    }

    public static boolean isPrime (int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
