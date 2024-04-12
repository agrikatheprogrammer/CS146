class Solution:
  
    @staticmethod
    def is_anagram(s, v):
        s_chars = s.split()
        v_chars = v.split()
        s_sub_v = all(a in v_chars for a in s_chars)
        v_sub_s = all(a in s_chars for a in v_chars)
        return s_sub_v and v_sub_s

    @staticmethod
    def is_anagram(s, v):
        return len(string1) == len(string2) and sorted(s) == sorted(v)
 
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
    print(Solution.is_anagram_counting(b, d)))

