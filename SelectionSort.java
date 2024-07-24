import java.util.Scanner;

public class SelectionSort {
    //Recursive Approach
    static int[] selectionSortRecurrsive(int[] arr,int n,int i){
        if(n==1 || i==n-1){
            return arr;
        }
        int minIndex = i;
        for(int j = i;j<n;j++){
            if(arr[minIndex]>arr[j]) minIndex=j;
        }
        int t = arr[minIndex];
        arr[minIndex] = i;
        arr[i] = t;
        return selectionSortRecurrsive(arr, n, i+1);

    }

    //Iterative Approach
    static int[] selectionSort(int[] arr,int n){
        int minIndex = -1;
        for(int i = 0;i<n-1;i++){
            minIndex = i;
            for(int j = i;j<n;j++){
                if(arr[minIndex]>arr[j]) minIndex=j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        sc.close();
        int[] resIter = selectionSort(arr,n);
        for(int i = 0;i<n;i++) System.out.print(resIter[i]+" ");
        System.out.println();
        int[] resRecur = selectionSortRecurrsive(arr,n,0);
        for(int i = 0;i<n;i++) System.out.print(resRecur[i]+" ");
    }
}
