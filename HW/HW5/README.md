(SOLUTION PROVIDED BY PROFESSOR ALREADY)

# Problem 1:
For each of the following recurrences, verify the answer you get by applying the master method, by solving the recurrence algebraically OR applying the recursion tree method. 

T(N) = 2T(N-1) + 1
T(N) = 3T(N-1) + n
T(N) = 9T(N/2) + n2
T(N) = 100T(N/2) + nlog2cn + 1  (c is a constant)
T(N) = 4T(N/2) + n2logn
T(N) = 5T(N/2) + n2/logn

## SOLUTION FOR PROBLEM 1:

#### Recurrence 1:
\[T(N) = 2T(N-1) + 1\]

**Solution:**

Applying the recursion tree method:
```
T(N) = 2T(N-1) + 1
     = 2[2T(N-2) + 1] + 1
     = 2^2T(N-2) + 2 + 1
     = 2^3T(N-3) + 2^2 + 2 + 1
     = ...
     = 2^kT(N-k) + 2^0 + 2^1 + 2^2 + ... + 2^(k-1)
```
When \(N - k = 1\), \(k = N-1\), so \(T(1)\) will appear.
Hence, the number of terms is \(N\).
\[T(N) = 2^NT(1) + (2^0 + 2^1 + ... + 2^{N-1})\]
\[T(N) = 2^NT(1) + 2^N - 1\]

\[T(N) = O(2^N)\]

#### Recurrence 2:
\[T(N) = 3T(N-1) + N\]

**Solution:**

Applying the recursion tree method:
```
T(N) = 3T(N-1) + N
     = 3[3T(N-2) + N-1] + N
     = 3^2T(N-2) + 3(N-1) + N
     = ...
     = 3^kT(N-k) + 3^(k-1)(N-1) + 3^(k-2)(N-2) + ... + 3^1(N-(k-1)) + 3^0(N-k)
```
When \(N - k = 1\), \(k = N-1\), so \(T(1)\) will appear.
Hence, the number of terms is \(N\).
\[T(N) = 3^NT(1) + 3^{N-1}(N-1) + ... + 3^1(2) + 3^0(1)\]
\[T(N) = O(3^N)\]

#### Recurrence 3:
\[T(N) = 9T(N/2) + N^2\]

**Solution:**

Applying the recursion tree method:
```
T(N) = 9T(N/2) + N^2
     = 9[9T(N/4) + (N/2)^2] + N^2
     = 9^2T(N/4) + 9(N/2)^2 + N^2
     = ...
     = 9^kT(N/2^k) + 9^(k-1)(N/2^(k-1))^2 + ... + 9^1(N/2)^2 + 9^0N^2
```
When \(N/2^k = 1\), \(k = log_2(N)\), so \(T(1)\) will appear.
Hence, the number of terms is \(log_2(N) + 1\).
\[T(N) = 9^{log_2(N)}T(1) + \sum_{i=0}^{log_2(N)-1}9^i(N/2^i)^2\]
\[T(N) = O(N^2 log(N))\]

#### Recurrence 4:
\[T(N) = 100T(N/2) + Nlog_2(cN) + 1\]

**Solution:**

Applying the master method:
\[a = 100, b = 2, f(N) = Nlog_2(cN) + 1\]

\[log_b(a) = log_2(100) = 6.64\]

Since \(f(N) = O(N^{log_b(a)-\epsilon})\), where \(\epsilon > 0\), and \(f(N) = O(N^{6.64-\epsilon})\), this case falls under case 2 of the master method.

\[T(N) = \Theta(N^{log_b(a)}) = \Theta(N^{6.64})\]

#### Recurrence 5:
\[T(N) = 4T(N/2) + N^2log(N)\]

**Solution:**

Applying the master method:
\[a = 4, b = 2, f(N) = N^2log(N)\]

\[log_b(a) = log_2(4) = 2\]

Since \(f(N) = \Omega(N^{log_b(a)+\epsilon})\), where \(\epsilon > 0\), and \(f(N) = \Omega(N^{2+\epsilon})\), this case falls under case 3 of the master method.

Now, we check if the regularity condition holds. Let's choose \(c = 1/2\) and see if \(af(N/b) \leq cf(N)\) for sufficiently large \(N\):
\[4(N/2)^2 log(N/2) \leq (1/2)N^2 log(N)\]
\[4(N^2/4) log(N) \leq (1/2)N^2 log(N)\]
\[N^2 log(N) \leq (1/2)N^2 log(N)\]

This inequality holds, so the regularity condition is satisfied.

Hence, \(T(N) = \Theta(N^2log(N))\).

#### Recurrence 6:
\[T(N) = 5T(N/2) + \frac{N^2}{log(N)}\]

**Solution:**

Applying the master method:
\[a = 5, b = 2, f(N) = \frac{N^2}{log(N)}\]

\[log_b(a) = log_2(5) \approx 2.32\]

Since \(f(N) = \Omega(N^{log_b(a)+\epsilon})\), where \(\epsilon > 0\), and \(f(N) = \Omega(N^{2.32+\epsilon})\), this case falls under case 3 of the master method.

Now, we check if the regularity condition holds. Let's choose \(c = 1/2\) and see if \(af(N/b) \leq cf(N)\) for sufficiently large \(N\):
\[5(N/2)^2 / log(N/2) \leq (1/2)N^2 / log(N)\]
\[5(N^2/4) / log(N/2) \leq (1/2)N^2 / log(N)\]

Since \(log(N/2) = log(N) - log(2) < log(N)\) for \(N > 2\), we can safely remove \(log(N/2)\) from the denominator.

\[(5/4)N^2 / log(N) \leq (1/2)
 

# Problem 2:
Below is some pseudocode. Come up with a recurrence relation, and solve that recurrence relation using any method of your choice.  

yetAnotherFunc(n): 
  if n > 1: 
    for(i=0;i<10n;i++)
      doSomething;
    yetAnotherFunc(n/2);
    yetAnotherFunc(n/2);
Hint: This code is slightly different from the pseudocode we've seen before. Think carefully about which method will help you come up with a good recurrence relation to solve. 

## SOLUTION FOR PROBLEM 2:

#### Recurrence Relation:
\[ T(N) = 2T(N/2) + 10N \]

**Explanation:**

The given pseudocode describes a recursive function `yetAnotherFunc(n)` that performs some operation `doSomething` 10 times for each value of `n`, and then calls itself recursively with `n/2` twice.

#### Recurrence Relation:
\[ T(N) = 2T(N/2) + 10N \]

**Solution:**

Applying the recurrence relation:
```
T(N) = 2T(N/2) + 10N
     = 2[2T(N/4) + 10(N/2)] + 10N
     = 2^2T(N/4) + 2*10(N/2) + 10N
     = ...
     = 2^kT(N/2^k) + 2^(k-1)*10(N/2^(k-1)) + ... + 2*10(N/2) + 10N
```

When \( N/2^k = 1 \), \( k = \log N \), so \( T(1) \) will appear.
Hence, the number of terms is \( \log N + 1 \).

\[ T(N) = 2^{\log N}T(1) + 10 \sum_{i=0}^{\log N - 1} \frac{N}{2^i} \]
\[ T(N) = NT(1) + 10N \sum_{i=0}^{\log N - 1} \frac{1}{2^i} \]
\[ T(N) = NT(1) + 10N(2 - 1) \]
\[ T(N) = NT(1) + 10N(\log N) \]

Since the given pseudocode has a linear operation for each recursive call and each recursive call reduces the problem size by half, the time complexity can be expressed as \( O(N \log N) \).
