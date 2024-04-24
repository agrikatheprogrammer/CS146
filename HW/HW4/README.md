# Problem 1:
We have discussed insertion sort as an algorithm. Now that we know how to analyze algorithms AND asymptotic notation, let's revisit Insertion Sort!

You may refer to class slides/ online resources to refresh your memory on the insertion sort algorithm. 

For insertion sort,

  * Best Case:
    
The best case occurs when the input array is already sorted. In this scenario, for each element in the array, only one comparison needs to be made with the elements before it, and no swaps are required. Therefore, the time complexity is O(n), where n is the number of elements in the array.

* Average Case:
  
In the average case, we assume that each element has an equal probability of being in any position in the array. In this case, for each element, on average, we need to compare it with half of the elements before it. Therefore, the average time complexity is O(n^2), where n is the number of elements in the array.

* Worst Case:
  
The worst case occurs when the input array is sorted in reverse order. In this scenario, for each element in the array, we need to compare it with all the elements before it and shift them to make space for the current element. This results in a time complexity of O(n^2), where n is the number of elements in the array.

* Time Complexity:
  
The time complexity of Insertion Sort in all cases (best case, average case, and worst case) is O(n^2), where n is the number of elements in the array.

 

# Problem 2:
Below is the pseudocode to perform matrix multiplication that we discussed in HW3. 

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


  * Best Case:

The best case occurs when both matrices are empty, resulting in no computation required. However, if we consider the case when matrices are non-empty, there isn't a specific best case scenario since the algorithm must perform all necessary computations regardless of the input matrices' contents. Therefore, the best case time complexity is equivalent to the worst case and average case.
  
  * Average Case:
  
In the average case, we assume that the matrices have random elements. For each element of the resulting matrix, we perform a constant number of operations (specifically, cols_A multiplications and additions). Therefore, the average case time complexity is O(rows_A×cols_B×cols_A).

  * Worst Case:

The worst case occurs when both matrices are large and have non-zero elements in every position. In this scenario, for each element of the resulting matrix, we perform a constant number of operations (specifically, cols_A multiplications and additions). Therefore, the worst case time complexity is O(rows_A×cols_B×cols_A).
  
  * Time complexity: 

The time complexity of matrix multiplication is O(rows_A×cols_B×cols_A).
