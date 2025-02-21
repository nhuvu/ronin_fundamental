public class Ex04 {
    /**
     * Viết chương trình liệt kê các số trong khoảng [100; 200] chia hết cho 5 hoặc chia hết cho 6.
     * Số chia hết cho cả 5 và 6 là không hợp lệ.
     * */
    public static void main(String[] args) {
        for(int i = 100; i <= 200; i++){
            if(i % 5 == 0 && i % 6 == 0){
                continue;
            } else if (i % 5 == 0 || i % 6 == 0) {
                System.out.println(i);
            }else {
                continue;
            }
        }
    }
}
