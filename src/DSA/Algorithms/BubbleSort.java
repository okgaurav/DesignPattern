package DSA.Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10, 11, 7, 9, 6, 5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubble(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private void bubble(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
