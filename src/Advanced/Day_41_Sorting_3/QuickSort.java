package Advanced.Day_41_Sorting_3;

public class QuickSort {
    public int[] solve(int[] A) {
        quickSort(A,0,A.length-1);
        return A;
    }
    public void quickSort(int[] A,int low,int high){
        if(low<high){
            int piv=partition(A, low,high);
            
        quickSort(A, low, piv-1);
        quickSort(A, piv+1, high);
        }
    }
    public int partition(int[] A, int low, int high){
        int pivot=A[high];
        int i=low-1;
        for(int j=low;j<=high;j++){
            if(A[j]<pivot){
                i++;
                swap(A,i,j);
            }
        }
        swap(A,i+1,high);
        return (i+1);
    }
    public void swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
