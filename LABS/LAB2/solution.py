class Solution:
  
    @staticmethod
    def is_anagram(s, v):
        return all(a in v for a in s) and all(a in s for a in v)
        
    @staticmethod
    def is_anagram_sort(s, v):
        return len(s) == len(v) and sorted(s) == sorted(v)
 
    @staticmethod
    def is_anagram_counting(string1, string2):
        return len(string1) == len(string2) and all(string1.count(char) == string2.count(char) for char in set(string1))

if __name__ == "__main__":
    a = "mwahaha"
    b = "ahahmaw"
    c = "ahahmab"
    d = "ah"
    print(Solution.is_anagram(a, b))
    print(Solution.is_anagram_sort(a, b))
    print(Solution.is_anagram_counting(a, b))
    print()
    print(Solution.is_anagram(a, c))
    print(Solution.is_anagram_sort(a, c))
    print(Solution.is_anagram_counting(a, c))
    print()
    print(Solution.is_anagram(b, d))
    print(Solution.is_anagram_sort(b, d))
    print(Solution.is_anagram_counting(b, d))


