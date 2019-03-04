public class MergeSort implements SortingAlgorithm
{
    public void sort(int[] arr) 
    {
		int n = arr.length;
		
        if (n < 2) 
        {
			return; 
        } 
        else 
        {
			int mid = n / 2;
			
			int[] left = new int[mid];
			int [] right = new int [n - mid];
			
            for (int i = 0; i < mid; i++) 
            {
				left[i] = arr[i];
			}
			
            for (int i = 0; i < n - mid; i++) 
            {
				right[i] = arr[mid + i];
			}
			
			sort(left);
			sort(right);
			
			merge(arr, left, right, mid, n - mid);
		}
		
	}
	
    public void merge(int[] arr, int[] left, int[] right, int leftLength, int rightLength) 
    {
		int l = 0, r = 0, i = 0;
		
        while (l < leftLength && r < rightLength) 
        {
            if (left[l] <= right[r]) 
            {
				arr[i++] = left[l++];
            } 
            else 
            {
				arr[i++] = right[r++];
			}
		}
		
        while(l < leftLength) 
        {
			arr[i++] = left[l++];
		}
		
        while(r < rightLength) 
        {
			arr[i++] = right[r++];
		}
	}
}