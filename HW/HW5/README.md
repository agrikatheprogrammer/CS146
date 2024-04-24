Problem 1:
For each of the following recurrences, verify the answer you get by applying the master method, by solving the recurrence algebraically OR applying the recursion tree method. 

T(N) = 2T(N-1) + 1
T(N) = 3T(N-1) + n
T(N) = 9T(N/2) + n2
T(N) = 100T(N/2) + nlog2cn + 1  (c is a constant)
T(N) = 4T(N/2) + n2logn
T(N) = 5T(N/2) + n2/logn
 

Problem 2:
Below is some pseudocode. Come up with a recurrence relation, and solve that recurrence relation using any method of your choice.  

yetAnotherFunc(n): 
  if n > 1: 
    for(i=0;i<10n;i++)
      doSomething;
    yetAnotherFunc(n/2);
    yetAnotherFunc(n/2);
Hint: This code is slightly different from the pseudocode we've seen before. Think carefully about which method will help you come up with a good recurrence relation to solve. 
