package notes;

public class BinarySearch {

    public int search(int[] arr, int num) {
        int lt = 0;
        int rt = arr.length - 1;

        return search(arr, lt, rt, num);
    }

    private int search(int[] arr, int lt, int rt, int num) {
        if (lt > rt) return -1;

        int mid = (lt + rt) / 2;
        if (arr[mid] == num) return mid;

        if (arr[mid] < num) return search(arr, mid + 1, rt, num);

        return search(arr, lt, mid - 1, num);
    }

    public int jumpSearch(int[] arr, int num) {
        int k = 0;
        int n = arr.length;

        for (int b = n / 2; b >= 1; b /= 2)
            while (k + b < n && arr[k + b] <= num) k += b;

        if (arr[k] == num) return k;

        return -1;
    }
}
