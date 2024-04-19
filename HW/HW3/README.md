# Problem 1:
We have discussed insertion sort as an algorithm. Now that we know how to analyze algorithms, let's apply the same analysis to Insertion Sort!

```
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
```

 

# Problem 2:
Below is the pseudocode to perform matrix multiplication, given two matrices A and B. 

```
MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B): 
    raise ValueError("Matrix multiplication is not defined.") 

  rows_A ← number of rows in A 
  cols_A ← number of columns in A 
  cols_B ← number of columns in B 
  result ← matrix of size rows_A x cols_B filled with zeros 

  for i from 1 to rows_A do: 
    for j from 1 to cols_B do: 
    sum ← 0 
      for k from 1 to cols_A do: 
        sum ← sum + A[i][k] * B[k][j] 
      result[i][j] ← sum return result
```

# Problem 1: Time Complexity Analysis for Insertion Sort
## Introduction:
Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time. It iterates through an array, repeatedly selecting the next element and inserting it into the sorted portion of the array.

## Algorithm Overview:

The algorithm starts with the second element of the array and compares it with the elements before it, moving larger elements one position to the right until it finds the correct position for the current element.
It continues this process for each element in the array until the entire array is sorted.

# Time Complexity Analysis:

## Best Case: O(n)
When the array is already sorted, Insertion Sort only needs to compare each element with its preceding element once, resulting in linear time complexity.
## Worst Case: O(n^2)
When the array is sorted in reverse order, each element needs to be compared and moved to its correct position, resulting in quadratic time complexity.
## Average Case: O(n^2)
In most scenarios, Insertion Sort exhibits quadratic time complexity as it involves nested loops and potentially multiple comparisons and swaps for each element.

## Assumptions:
- The time complexity analysis assumes basic operations like comparison and swapping take constant time.
- No specific data characteristics or patterns in the input array are considered.


# Problem 2: Time Complexity Analysis for Matrix Multiplication Pseudocode
## Introduction:
Matrix multiplication is an important operation in linear algebra and computer science, widely used in various applications.

## Pseudocode Overview:
- The pseudocode first checks if the number of columns in matrix A matches the number of rows in matrix B, ensuring compatibility for multiplication.
- It initializes a result matrix with appropriate dimensions and fills it with zeros.
- It iterates through each element of the result matrix, calculating the dot product of corresponding rows and columns from matrices A and B.
  
# Time Complexity Analysis:

The time complexity of matrix multiplication depends on the dimensions of the input matrices.

For two matrices of dimensions m × n and n × p, the overall time complexity is O(mnp).

## Assumptions:

- The time complexity analysis assumes basic operations like addition and multiplication take constant time.
- It assumes no specific patterns or characteristics in the matrices affecting the complexity.
