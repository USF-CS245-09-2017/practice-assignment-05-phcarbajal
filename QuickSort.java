public class QuickSort implements SortingAlgorithm
{
    public void sort(int[] arr)
    {
        quicksort(arr, 0, arr.length - 1);
    }

    public void quicksort(int[] arr, int left, int right)
    {
        if (left >= right)
        {
            return;
        }

        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quicksort(arr, left, index - 1);
        quicksort(arr, index, right);
    }

    public int partition(int[] arr, int left, int right, int pivot)
    {
        while (left <= right)
        {
            while(arr[left] < pivot)
            {
                left++;
            }
            while(arr[right] > pivot)
            {
                right--;
            }
            if (left <= right)
            {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public void swap(int[] arr, int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = arr[temp];
    }
}