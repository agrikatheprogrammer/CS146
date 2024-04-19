# Problem 1:
Let's compare some basic math functions to refresh our memory. 

For each of the following, just write which function is asymptotically greater (So, you should be thinking about your asymptotic notations!). 

Show your reasoning for the same.

* 10000000000n^2 vs n^3: n^3 because in asymptotic analysis, we focus on the dominant term that grows the fastest as the input size increases. In this case, even though the coefficient for n^2 is larger than n^3, the term n^3 grows faster as n increases.
* n^2 log(n) vs n(log(n))10:
* nlogn vs 2:
* 2n vs 22n:

  
# Problem 2:
Now let's examine some [pseudo]code and apply asymptotic notation to it. 

```
isPrime(n): 
  for(i = 2, i*i <= n; i++) {
    if(n % i == 0) {
      return false
    }
  return true
```

* Best Case:
* Worst Case:
* Average Case:
* Time complexity for the above function:
