class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Check if the starting point already has the new color
        if (image[sr][sc] == newColor) return image;
        
        // Call the floodFill method to perform the flood fill operation
        flood(image, sr, sc, newColor, image[sr][sc]);
        
        return image;
    }

    // Method to perform flood fill
    private void flood(int[][] image, int sr, int sc, int newColor, int oldColor) {
        // Base case: Check if the current position is out of bounds or has the new color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length ||
            image[sr][sc] != oldColor)
            return;

        // Update the color of the current position
        image[sr][sc] = newColor;

        // Recursively flood fill in the four directions
        flood(image, sr - 1, sc, newColor, oldColor); // Up
        flood(image, sr + 1, sc, newColor, oldColor); // Down
        flood(image, sr, sc - 1, newColor, oldColor); // Left
        flood(image, sr, sc + 1, newColor, oldColor); // Right
    }
}

