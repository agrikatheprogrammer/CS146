# Problem 1:
We have discussed insertion sort as an algorithm. Now that we know how to analyze algorithms AND asymptotic notation, let's revisit Insertion Sort!

You may refer to class slides/ online resources to refresh your memory on the insertion sort algorithm. 

For insertion sort, what is the 
  *Best Case:
  *Average Case:
  *Worst Case: 
  *Time complexity: 

 

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

For the above pseudocode, what is the 
  *Best Case:
  *Average Case:
  *Worst Case: 
  *Time complexity: 
