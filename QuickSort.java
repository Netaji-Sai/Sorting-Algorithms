import java.util.Scanner;

public class QuickSort {
    static void quickSort(int[] a,int low,int high){
        if(low<high){
            int pi = partition(a,low,high);
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }
    static int partition(int[] a,int low,int high){
        int i = low;
        int j = high;
        int pivot = a[low];
        while(i<j){
            while(a[i]<=pivot && i<=high) i++;
            while(a[j]>pivot && j>=low) j--;
            if(i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        //we have to place pivot at correct position
        int t = a[j];
        a[j] = a[low];
        a[low] = t;
        return j;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        sc.close();
        quickSort(arr, 0, n-1);
        for(int i = 0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
