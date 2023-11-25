package algorithm.sort;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 14:06
 * 归并排序
 */
public class MergeSort {

    public static void Merge_sort(int[] num) {
        int l = 0;
        int r = num.length - 1;
        int[] temp = new int[num.length];
        merge(num, l, r, temp);
    }

    public static void merge(int[] num, int l, int r, int[] temp) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            merge(num, l, mid, temp);
            merge(num, mid + 1, r, temp);
            sort(num, l, mid, r, temp);
        }
    }

    public static void sort(int[] num, int l, int mid, int r, int[] temp) {
        int k = mid + 1;
        int m = l;
        int index = 0;
        while (m <= mid && k <= r) {
            if (num[m] > num[k]) {
                temp[index++] = num[k++];
            } else {
                temp[index++] = num[m++];
            }
        }

        while (m <= mid) {
            temp[index++] = num[m++];
        }
        while (k <= r) {
            temp[index++] = num[k++];
        }

        for (int i = 0; i < index; i++) {
            num[i + l] = temp[i];
        }
    }
}
