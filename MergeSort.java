import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int[] a,int low,int high){
        //Base Case
        if(low>=high) return;
        int mid = low+(high-low)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a,low,mid,high);
    }
    static void merge(int[] a,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int k = 0;
        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                temp[k] = a[left];
                k++;
                left++;
            }else{
                temp[k] = a[right];
                k++;
                right++;
            }
        }
        while(left<=mid){
            temp[k] = a[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k] = a[high];
            right++;
            k++;
        }
        for(int i = 0;i<temp.length;i++){
            //here it should be low + i because in some cases where we have right subarray then index should be from low of that suarray
            a[low+i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        sc.close();
        mergeSort(arr, 0, n-1);
        for(int i = 0;i<n;i++) System.out.print(arr[i]+" ");
    }
}