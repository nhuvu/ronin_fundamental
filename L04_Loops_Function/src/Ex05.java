public class Ex05 {
    /**
     * Sử dụng vòng lặp while để tìm số nguyên n lớn nhất thỏa mãn n^3 < 12.000.
     * */
    public static void main(String[] args) {
        int max = 0;
        int n = 1;
        while (n*n*n < 12000){
            if(n > max){
                max = n;
            }
            n++;
        }
        System.out.printf("Số nguyên n lớn nhất thoả mãn n^3 < 12000 là %d", max);
    }
}
