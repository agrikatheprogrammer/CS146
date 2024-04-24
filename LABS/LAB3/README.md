# Problem 1:
Let's compare some basic math functions to refresh our memory. 

For each of the following, just write which function is asymptotically greater (So, you should be thinking about your asymptotic notations!). 

Show your reasoning for the same.

* 10000000000n^2 vs n^3: n^3 because in asymptotic analysis, we focus on the dominant term that grows the fastest as the input size increases. In this case, even though the coefficient for n^2 is larger than n^3, the term n^3 grows faster as n increases.
* n^2 log(n) vs n(log(n))^10: Logarithmic terms grow slower than polynomial terms. In this case, although the base of the logarithm is raised to the power of 10 in the latter term, it is still a logarithmic function compared to the polynomial n^2, so n^2logn dominates over n(log(n))^10 as n increases.
* nlogn vs 2: nlogn because nlogn grows faster than 2 as n increases; 2 does not have any growth - it is a constant term.
* 2n vs 22n: 22n because 22n=11(2n) meaning 22n grows faster than 2n (greater coefficient) as n increases

  
# Problem 2:
Now let's examine some [pseudo]code and apply asymptotic notation to it. 

```
isPrime(n): 
  for(i = 2, i*i <= n; i++) {
    if(n % i == 0) 
      return false
    }
  return true
```

* Best Case: 

  The best case occurs when n is not divisible by any number from 2 to sqrt(n) and thus, loop will only execute once to check if statement condition and return false, giving a best case time complexity of O(1).
  
* Worst Case:

  The worst case occurs when n is a prime number and during every loop, if statement's condition is false, so loop is executed
  sqrt(n) times, and upon completion, function returns true, giving a worst case time complexity of O(sqrt(n)).
  
* Average Case:

In the average case, we assume that n has an equal probability of being prime or composite. If n is composite, the loop will terminate early upon finding a factor. On average, we can expect to iterate O(sqrt(n)) times. Therefore, the average-case time complexity is also O(sqrt(n)).
  
* Time complexity for the above function:

The time complexity of the isPrime(n) function is O(sqrt(n))






