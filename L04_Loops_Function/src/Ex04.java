public class Ex04 {
    /**
     * List down all number in range [100,200] which can divide by 5 OR 6
     * Not include number which divide by 5 AND 6
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
