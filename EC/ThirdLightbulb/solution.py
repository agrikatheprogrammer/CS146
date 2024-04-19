class Solution:
    @staticmethod
    def fibonacci(n):
        if n <= 1:
            return n

        a, b = 0, 1
        for i in range(2, n + 1):
            next_fib = a + b
            a = b
            b = next_fib
        return b

