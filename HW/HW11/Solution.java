class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        
        flood(image, image[sr][sc], newColor, sr, sc);
        
        return image;
    }

   public void flood(int[][] image, int sr, int sc, int newcol, int color) {
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
    flood(image, sr - 1, sc, newColor, oldColor);
    flood(image, sr, sc - 1, newColor, oldColor);
    flood(image, sr, sc + 1, newColor, oldColor);
    flood(image, sr + 1, sc, newColor, oldColor);
}
}
