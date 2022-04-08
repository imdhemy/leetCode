package notes;

public class MergeSort {

    public void topDown(int[] arr) {
        topDown(arr, 0, arr.length - 1);
    }

    private void topDown(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            topDown(arr, start, mid);
            topDown(arr, mid + 1, end);

            topDownMerge(arr, start, mid, end);
        }
    }

    private void topDownMerge(int[] arr, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }

        while (i <= mid)
            tmp[k++] = arr[i++];

        while (j <= end)
            tmp[k++] = arr[j++];

        for (i = start; i <= end; i++)
            arr[i] = tmp[i - start];
    }
}
