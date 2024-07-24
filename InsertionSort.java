import java.util.Scanner;

public class InsertionSort {
    //Recursive
    static int[] insertionSortRecurrsive(int[] a,int n,int i){
        if(i==n || n==1){
            return a;
        }
        int j = i;
        while(j>0 && a[j-1]>a[j]){
            int t = a[j-1];
            a[j-1] = a[j];
            a[j] = t;
            j--;
        }
        return insertionSortRecurrsive(a, n, i+1);
    }

    //Iterative
    static int[] insertionSort(int[] a,int n){
        for(int i = 1;i<n;i++){
            int j = i;
            while(j>0 && a[j-1]>a[j]){
                int t = a[j-1];
                a[j-1] = a[j];
                a[j] = t;
                j--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        sc.close();
        int[] resIter = insertionSort(arr,n);
        for(int i = 0;i<n;i++) System.out.print(resIter[i]+" ");
        System.out.println();
        int[] resRecur = insertionSortRecurrsive(arr,n,0);
        for(int i = 0;i<n;i++) System.out.print(resRecur[i]+" ");
    }
}
