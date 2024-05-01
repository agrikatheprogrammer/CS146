# Longest Palindrome Length in a String
## Overview
Given a string s, the task is to find the length of the longest palindrome that can be formed using the characters in the string. A palindrome is a string that reads the same forwards and backwards.

## Approach: HashMap for Character Counts
* Initialize Variables: Start by initializing a variable odd_count to keep track of the count of characters with odd occurrences. Also, initialize an empty dictionary d to store the count of each character in the string.
* Count Characters: Iterate through each character ch in the string s. Update the count of character occurrences in the dictionary d.
* Update Odd Count: After updating the count of occurrences for each character, check if the count is odd (d[ch] % 2 == 1). If it is, increment the odd_count variable; otherwise, decrement it.
* Determine Palindrome Length:

    If odd_count is greater than 1, it means there are more than one character with odd occurrences in the string. In such cases, it's not possible to form a palindrome. Hence, return len(s) - odd_count + 1, adjusting for the extra odd-count character that can be used in the palindrome.

    If odd_count is 1 or 0, it means it's possible to form a palindrome using all characters in the string. In such cases, return the length of the input string len(s).
  
## Complexity Analysis
* Time Complexity: The time complexity of this approach is O(n), where n is the length of the input string s. This is because we iterate through each character in the string once.
* Space Complexity: The space complexity is also O(n), where n is the length of the input string s, due to the storage of character counts in the dictionary d.











Here's another algorithmic problem! Here's the problem statement:

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Again, your problem has additional details:

Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
Function definition for Java: 

    public int longestPalindrome(String s) {

    }
