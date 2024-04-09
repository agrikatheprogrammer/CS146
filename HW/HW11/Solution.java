class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        
        flood(image, image[sr][sc], newColor, sr, sc);
        
        return image;
    }

   public void floodFill(int[][] image, int sr, int sc, int color) {
    if (
        sr < 0 ||
        sc < 0 ||
        sr >= image.size() ||
        sc >= image[sr].size() ||
        image[sr][sc] == newColor ||
        image[sr][sc] != oldColor
    ) 
        return;
    

    image[sr][sc] = newColor;
    floodFill(image, sr - 1, sc, newColor, oldColor);
    floodFill(image, sr, sc - 1, newColor, oldColor);
    floodFill(image, sr, sc + 1, newColor, oldColor);
    floodFill(image, sr + 1, sc, newColor, oldColor);
}
}
