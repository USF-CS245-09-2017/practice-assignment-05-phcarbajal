public class QuickSort implements SortingAlgorithm
{
    public void sort(int[] arr)
    {
		sort(arr, 0, arr.length - 1);
		
	}
	
    public void sort(int[] arr, int l, int r) 
    {
        if (l < r) 
        {
			int p = partition(arr, l, r);
			
			sort(arr, l, p - 1);
			sort(arr, p + 1, r);
			
		}
	}
	
	public int partition(int[] arr, int l, int r) {
		if (l < r) {
			int pivot = l;
			int i = l + 1; // offset
			int j = r;
			
            while (i < j) 
            {
                while (i <= r && arr[i] <= arr[pivot]) 
                {
					++i; // increment, then assign val
				}
                while (j >= i && arr[j] > arr[pivot]) 
                {
					--j; // decrement, then assign val
				}
				
				if (i <= r && i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;  // pivot to the mid
			
			return j;
		}
		
		return l;
    }
}