public class Ex12 {
    /**
     * Find the perfect numbers < 10000
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
