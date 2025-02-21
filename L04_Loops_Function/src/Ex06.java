public class Ex06 {
    /**
     * Viết một chương trình hiển thị tất cả các số nguyên tố trong khoảng từ [2, 1000].
     * */
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố trong khoảng [2,1000] là: ");
        for(int i = 2; i <= 1000; i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
