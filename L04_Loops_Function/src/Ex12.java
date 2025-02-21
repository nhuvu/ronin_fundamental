public class Ex12 {
    /**
     * Một số nguyên dương được gọi là số hoàn hảo nếu nó bằng tổng của tất cả các ước số dương của nó, không bao gồm chính nó.
     * Ví dụ, 28 là số hoàn hảo vì 28 = 14 + 7 + 4 + 2 + 1. Viết một chương trình để tìm các số hoàn hảo < 10.000.
     * */
    public static void main(String[] args) {
        System.out.println("Các số hoàn hảo < 10000: ");
        for(int i = 1; i < 10000; i++){
            if(isPerfect(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int n){
        if(n <= 1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return n == sum;
    }
}
