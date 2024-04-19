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
