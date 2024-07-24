import java.util.Scanner;

public class BubbleSort{
    //Recurssion
    static void bubbleSortRecurrsion(int[] a, int n) {
        if (n == 1) {
            return; // Array of length 1 is already sorted
        }
    
        // One pass of bubble sort to move the largest element to the end
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                // Swap a[i] and a[i+1]
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
    
        // Recursively sort the remaining array
        bubbleSortRecurrsion(a, n - 1);
    }
    

    //Iterative
    static int[] bubbleSort(int[] a,int n){
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
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
        int[] resIter = bubbleSort(arr,n);
        for(int i = 0;i<n;i++) System.out.print(resIter[i]+" ");
        System.out.println();
        bubbleSortRecurrsion(arr,n);
        for(int i = 0;i<n;i++) System.out.print(arr[i]+" ");
    }
}