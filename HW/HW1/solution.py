class solution:
    def isPalindrome(self, s: str) -> bool:
        isIt = True
        temp = ""
        
        for char in s:
            if char.isalnum():
                temp += char
                
        temp = temp.lower()
        n = len(temp)
        
        # Compare char by char: first char == last? second char == second last?..
        for i in range(n):
            if temp[i] != temp[n - i - 1]:
                isIt = False
                break
                
        return isIt

