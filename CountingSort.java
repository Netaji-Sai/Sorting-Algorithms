import java.util.Scanner;

public class CountingSort {
    static int[] countingSort(int[] a, int n) {
        // Find Min ele and Max
        int min = a[0], max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }
        
        // Counting Array - k+1 elements
        int k = max - min;
        int[] count = new int[k + 1];
        
        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            count[a[i] - min]++;
        }
        
        // Update Count Array to hold actual positions
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }
        
        // Result array - build the sorted array
        int[] b = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            b[--count[a[i] - min]] = a[i];
        }
        
        return b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        
        int[] res = countingSort(a, n);
        
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
