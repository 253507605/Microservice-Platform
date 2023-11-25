package algorithm.sort;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 14:06
 * 希尔排序
 */
public class HillSort {

    public static void Hill_sort(int[] num) {
        for (int gap = num.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < num.length; i++) {
                int temp = num[i];
                int j = i - gap;
                while (j >= 0 && num[j] > temp) {
                    num[j + gap] = num[j];
                    j = j - gap;
                }
                num[j + gap] = temp;
            }
        }
    }
}
