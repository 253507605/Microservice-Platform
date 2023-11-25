package algorithm.sort;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 14:06
 */
public class QuickSort {

    public static void Quick_sort(int[] num) {
        sort(0, num.length - 1, num);
    }

    public static void sort(int l, int r, int[] num) {
        if (l < r) {
            int pa = partition(l, r, num);
            sort(l, pa - 1, num);
            sort(pa + 1, r, num);
        }
    }

    public static int partition(int l, int r, int[] num) {
        int temp = num[l];
        int i=l+1;
        int j=r;
        while (i<j){
            if(num[i]<temp){
                i++;
            } else if(num[j]>temp){
                j--;
            } else {
                int t = num[i];
                num[i]=num[j];
                num[j]=t;
                i++;
                j--;
            }
        }

        num[l]=num[j];
        num[j]=temp;

        return j;
    }
}
