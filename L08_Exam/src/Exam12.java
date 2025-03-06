public class Exam12 {
    /**
     * Tìm một số nhỏ nhất có tổng các chữ số bằng k.
     * Ví dụ: k = 10, có 19 là số nhỏ nhất có tổng bằng 10 (1 + 9).
     *
     * Input: Nhập vào k = 30.
     *Output: In ra kết quả số nhỏ nhất có tổng các chữ số bằng 30. (3999)
     * */

    public static void main(String[] args) {
        System.out.println(findMinWithSum(30));
    }

    //Từ vd rút ra công thức tìm ra số nhỏ nhất có tổng các chữ số = k (vd: 10)
    //k/9 = i (vd: 1)
    //k%9 = j (vd: 1)
    //-> số cần tìm: j + i lần 9 (vd: 19)
    public static int findMinWithSum (int k){
        if(k < 10){
            return k;
        }
        int remainder = k % 9;
        int divResult = k / 9;
        String s = String.valueOf(remainder);
        for(int i = 0; i < divResult; i++){
            s += String.valueOf(9);
        }
        return Integer.parseInt(s);
    }
}

