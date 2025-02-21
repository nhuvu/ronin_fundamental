public class Ex02 {
    /**
     * Giả sử học phí của một trường đại học là 10.000 đô la trong năm nay và tăng 5% mỗi năm.
     * Trong một năm, học phí sẽ là 10.500 đô la.
     * Viết một chương trình hiển thị học phí trong 10 năm tới và tổng chi phí học phí của 4 năm bắt đầu từ năm thứ 11.
     * */
    public static void main(String[] args) {
        int currentYearFee = 10000;
        int sumFee = 0;
        System.out.println("Học phí trong 10 năm tới: ");
        for(int i = 1; i <= 10; i++){
            currentYearFee = (currentYearFee * 105)/100;
            System.out.printf("Học phí năm thứ %d: %d \n", i, currentYearFee);
        }
        System.out.println("----------------");
        for(int i = 11; i <= 14; i++){
            currentYearFee = (currentYearFee * 105)/100;
            sumFee += currentYearFee;
            System.out.printf("Học phí năm thứ %d: %d \n", i, currentYearFee);
        }
        System.out.printf("Tổng học phí trong 4 năm từ năm 11 -> 14: %d", sumFee);
    }
}
