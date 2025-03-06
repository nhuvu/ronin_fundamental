public class Exam06 {
    /**
     * Viết chương trình loại bỏ các các số bị lặp lại trong mảng arr.
     * Ví dụ {1, 2, 2, 3, 4, 3, 1} -> {1, 2, 3, 4}.
     * Lưu ý thứ tự các số vẫn phải được đảm bảo.
     * <p>
     * Input: int[] arr = {-1336439950, -1336439950, -1627142690, -1627142690, -1627142690,
     * -580008775, 1590173078, -540904643, 259998404, 259998404, 1590173078, -1336439950,
     * 1782288190, -580008775, -580008775, -580008775, 1782288190, -1080819275, -1627142690,
     * -580008775, -944880215, 259998404, -1627142690, -580008775, -580008775, -580008775, 259998404,
     * 1782288190, -580008775, -1336439950};
     * <p>
     * Output: In ra giá trị arr[7] sau khi arr đã loại bỏ hết các phần tử trùng nhau. (-1080819275)
     */
    public static void main(String[] args) {
        int[] arr = {-1336439950, -1336439950, -1627142690, -1627142690, -1627142690,
                -580008775, 1590173078, -540904643, 259998404, 259998404, 1590173078,
                -1336439950, 1782288190, -580008775, -580008775, -580008775, 1782288190,
                -1080819275, -1627142690, -580008775, -944880215, 259998404, -1627142690,
                -580008775, -580008775, -580008775, 259998404, 1782288190, -580008775, -1336439950};

        int[] unique = uniqueArr(arr);
        System.out.println(unique[7]);
    }

    public static int[] uniqueArr(int[] array) {
        int countDuplicate = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                    countDuplicate++;
                }
            }
        }
        int[] unique = new int[array.length - countDuplicate];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != 0) {
                unique[index] = array[j];
                index++;
            }
        }
        return unique;
    }
}
