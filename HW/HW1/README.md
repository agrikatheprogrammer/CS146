# 1ST SOLUTION: 
Cleaning the Input String:
The input string s is cleaned by removing all non-alphanumeric characters using the replaceAll method with a regular expression [^\w], which matches any character that is not a letter or digit.
All uppercase characters are converted to lowercase using toLowerCase() method to ensure case-insensitive comparison.
Palindrome Check:
If the length of the cleaned string temp is 0 or 1 (n <= 1), it means it is either empty or contains only one character, which makes it a palindrome by definition. In this case, the method returns true immediately.
For strings of length greater than 1, the method proceeds to compare characters from both ends of the string towards the center.
It iterates over the string temp using a for loop with an index i from 0 to n-1. Within each iteration:
It checks if the character at index i is not equal to the character at the corresponding index from the end of the string (n - i - 1). If they are not equal, it means the string is not a palindrome, and it returns false immediately.
If the loop completes without finding any mismatch, it indicates that the string is a palindrome, and the method returns true.
Return Value:
If the loop doesn't exit early due to a mismatch, it means all characters were successfully compared, and the string is a palindrome. In this case, the method returns true.
If any mismatch is found during the comparison, the method returns false immediately, indicating that the string is not a palindrome.

# 4TH SOLUTION:

