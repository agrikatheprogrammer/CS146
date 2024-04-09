 public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    if (
        sr < 0 ||
        sc < 0 ||
        sr >= (int)image.size() ||
        sc >= (int)image[r].size() ||
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
