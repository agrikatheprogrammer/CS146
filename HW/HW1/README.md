# 1ST SOLUTION: 
## Cleaning the Input String:
- The input string s is cleaned by removing all non-alphanumeric characters using the replaceAll method with a regular expression [^\w], which matches any character that is not a letter or digit.
- All uppercase characters are converted to lowercase using toLowerCase() method to ensure case-insensitive comparison.
## Palindrome Check:
- If the length of the cleaned string temp is 0 or 1 (n <= 1), it means it is either empty or contains only one character, which makes it a palindrome by definition. In this case, the method returns true immediately.
- For strings of length greater than 1, the method proceeds to compare characters from both ends of the string towards the center.
- It iterates over the string temp using a for loop with an index i from 0 to n-1. Within each iteration:
- It checks if the character at index i is not equal to the character at the corresponding index from the end of the string (n - i - 1). If they are not equal, it means the string is not a palindrome, and it returns false immediately.
- If the loop completes without finding any mismatch, it indicates that the string is a palindrome, and the method returns true.
## Return Value:
- If the loop doesn't exit early due to a mismatch, it means all characters were successfully compared, and the string is a palindrome. In this case, the method returns true.
- If any mismatch is found during the comparison, the method returns false immediately, indicating that the string is not a palindrome.

# 2ND SOLUTION:
- This approach removes non-alphanumeric characters from the input string and converts it to lowercase.
- If the length of the cleaned string is 0 or 1, it immediately returns true.
- It then compares the two characters at the beginning and end of the string.
- If they don't match, it returns false.
- Otherwise, it recursively checks the substring excluding the first and last characters.

# 3RD SOLUTION: 
- This approach removes non-alphanumeric characters from the input string and converts it to lowercase.
- It uses a recursive helper function to reverse the string.
- If the reversed string is equal to the original string, it returns true, indicating that it is a palindrome.

# 4TH SOLUTION:
- This approach iterates through the string using two pointers (start and last), starting from the beginning and end of the string respectively.
- It compares characters at these pointers, ignoring non-alphanumeric characters.
- If the characters don't match, it returns false.
- Otherwise, it moves both pointers towards the center of the string and continues the comparison.
- If the loop completes without finding any mismatch, it returns true, indicating that the string is a palindrome.

