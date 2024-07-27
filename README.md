# Sorting-Algorithms
Welcome to the Sorting Algorithms in Java repository! This collection includes implementations of various sorting algorithms, coded in Java, showcasing both iterative and recursive approaches. These algorithms are essential for understanding data structures and algorithms in computer science, and this repository serves as a comprehensive resource for learning and reference.

## Repository Contents
This repository contains the following sorting algorithms(Recursive and Iterative):
1. Bubble Sort
2. Selection Sort
3. Insertion Sort
4. Merge Sort
5. Quick Sort
6. Counting Sort
7. Heap Sort

## Algorithms Explained
### 1. Bubble Sort
Bubble Sort is a simple comparison-based sorting algorithm. The algorithm repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until the list is sorted.
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)

### 2. Selection Sort
Selection Sort works by dividing the input list into a sorted and an unsorted region. It repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted region and moves it to the sorted region.
* Time Complexity: O(n^2)
* Space Complexity: O(1)

### 3. Insertion Sort
Insertion Sort builds the sorted array one element at a time by repeatedly picking the next element and inserting it into the correct position.
* Time Complexity: O(n^2)
* Space Complexity: O(1)

### 4. Merge Sort
Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts them, and then merges the sorted halves.
* Time Complexity: O(n log n)
* Space Complexity: O(n)

### 5. Quick Sort
Quick Sort is a highly efficient sorting algorithm that selects a 'pivot' element from the array and partitions the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
* Time Complexity:
   * Average: O(n log n),
   * Worst: O(n^2)
* Space Complexity: O(log n)

### 6. Counting Sort
Counting Sort is a non-comparison-based sorting algorithm that counts the number of occurrences of each distinct element in the input and uses this information to place each element in its correct position.
* Time Complexity: O(n+k), where n is the number of elements and k is the range of the input
* Space Complexity: O(k)

### 7. Heap Sort
* Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure to sort elements. The binary heap can be either a max-heap or a min-heap, depending on the sorting order required. For sorting in ascending order, a max-heap is typically used.
* Time Complexity: O(nlogn), where n is the number of elements
  * For Heap : O(n)
  * For Sorting : O(nlogn)
* Space Complexity: O(1) -> as we dont use any extra space here.

## How to Use
To run any of these sorting algorithms, you can clone this repository and compile the Java files using any Java IDE or the command line. Here's an example of how to run the Bubble Sort Iterative version:
### Clone the repository
git clone https://github.com/Netaji-Sai/Sorting-Algorithms/
cd SortingAlgorithms
### Compile the Java file
javac BubbleSort.java
### Run the program
java BubbleSort

## Contribution
Feel free to fork this repository, make improvements, and submit pull requests. Any suggestions for additional features or improvements are always welcome!

## License
This repository is licensed under the MIT License, allowing you to freely use, modify, and distribute the code.

## Contact
If you have any questions or feedback, please reach out to me at netajisuru2004@gmail.com or connect with me on LinkedIn(Netaji Sai Suru).
