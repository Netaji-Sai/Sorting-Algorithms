import java.util.Scanner;

public class HeapSort {
    static void maxHeapify(int[] a,int n,int i){
        int largest = i;
        int left = (2*i)+1;
        int right = (2*i)+2;
        if(left<n && a[left]>a[largest]) largest = left;
        if(right<n && a[right]>a[largest]) largest = right;
        if(largest!=i){
            swap(a,i,largest);
            maxHeapify(a, n, largest);
        }
    }
    static void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    static void heapSort(int[] a,int n){
        //Bulding Max Hep
        for(int i = (n-1)/2;i>=0;i--){
            maxHeapify(a,n,i);
        }
        //Deleting element from Heap (or) Moving max element to end of aarray
        for(int i = n-1;i>=0;i--){
            swap(a,0,i);
            maxHeapify(a,i,0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        sc.close();
        heapSort(arr,n);
        for(int i = 0;i<n;i++) System.out.print(arr[i]+" ");;
    }
}
