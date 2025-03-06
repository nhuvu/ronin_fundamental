public class Exam08 {
    /**
     * Viết chương trình tìm số Fibonacci thứ 50.
     *
     * Input: Một số nguyên n = 50
     *Output: Một số nguyên là số Fibonacci thứ 50 (12586269025)
     * */
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    public static long fibonacci(int n) {
        long[] f = new long[n + 1];
        f[0] = 0;
        f[1] = 1;

        for(int i = 2 ; i <= n ; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

}
