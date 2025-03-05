public class Ex12 {
    /**
     * Cho một chuỗi String a = "3c6b9a0e8d3a9c8o0e9b83d60eab9bcd6o8a0e6c3b9a98c3dbe0o803e6cba98d60o39a0e6cb98a3dbe0o3c8d960eb9a6"
     * - Gọi x là số lượng ký tự chữ (a-z) có trong chuỗi
     * - Gọi y là số lượng ký tự số (0-9) có trong chuỗi.
     * Nhiệm vụ của bạn là tính (y+x)%7.
     *
     *Input: Chuỗi ký tự a như trên
     *Output: In ra kết quả (y+x)%7 (5)
     * */
    public static void main(String[] args) {
        String a = "3c6b9a0e8d3a9c8o0e9b83d60eab9bcd6o8a0e6c3b9a98c3dbe0o803e6cba98d60o39a0e6cb98a3dbe0o3c8d960eb9a6";
        int x = 0; int y = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 48 && a.charAt(i) <= 57){
                x++;
            }else {
                y++;
            }
        }
        System.out.println((x+y)%7);
    }
}
