class Solution:
    def floodFill(self, image, sr, sc, newColor):
        if image[sr][sc] == newColor:
            return image
        
        self.flood(image, image[sr][sc], newColor, sr, sc)
        
        return image

    def flood(self, image, oldColor, newColor, sr, sc):
        if (sr < 0 or
            sc < 0 or
            sr >= len(image) or
            sc >= len(image[sr]) or
            image[sr][sc] == newColor or
            image[sr][sc] != oldColor):
            return
        
        image[sr][sc] = newColor
        self.flood(image, oldColor, newColor, sr - 1, sc)
        self.flood(image, oldColor, newColor, sr, sc - 1)
        self.flood(image, oldColor, newColor, sr, sc + 1)
        self.flood(image, oldColor, newColor, sr + 1, sc)

