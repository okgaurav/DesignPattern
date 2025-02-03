package DSA.Algorithms;


import java.util.LinkedList;
import java.util.Queue;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {4, 2, 9, 3, 7, 6, 8};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr,0, arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
    }

    private void merge(int arr[], int left, int mid, int right) {
        int larr = mid - left + 1;
        int raar = right - mid;
        int la[] = new int[larr];
        int ra[] = new int[raar];

        for (int i = 0; i < larr; i++)
            la[i] = arr[left + i];
        for (int i = 0; i < raar; i++)
            ra[i] = arr[mid + i + 1];

        int i = 0, j = 0, k = left;
        while (i < larr && j < raar) {
            if (la[i] <= ra[j]) {
                arr[k] = la[i];
                i++;
            } else {
                arr[k] = ra[j];
                j++;
            }
            k++;
        }
        while (i < larr) {
            arr[k] = la[i];
            i++;
            k++;
        }
        while (j < raar) {
            arr[k] = ra[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
}
