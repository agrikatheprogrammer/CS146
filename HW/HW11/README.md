# PROBLEM STATEMENT

An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.


# EXPLANATION OF ALGORITHM
The flood fill algorithm is a method used to fill contiguous regions of a two-dimensional grid with a specified color. It operates by starting from a designated seed point within the grid and recursively spreading outwards, filling neighboring pixels with the desired color until a boundary is encountered or until all adjacent pixels have been filled. At the outset, the algorithm checks if the starting pixel already has the desired fill color, in which case it terminates early to avoid redundant processing. Once the starting pixel is established, the algorithm examines its neighboring pixels in all four cardinal directions: north, south, east, and west. For each neighboring pixel, the algorithm verifies whether it meets certain conditions for filling, such as being within the grid boundaries, having the same color as the starting pixel, and not already being filled. If a neighboring pixel satisfies these criteria, it is recursively filled with the designated color, and the flood fill operation continues to propagate outward from that pixel, extending the filled region. The algorithm repeats this process for each eligible neighboring pixel until no more adjacent pixels can be filled or until the entire connected region has been filled. It is crucial to handle boundary conditions properly to prevent accessing pixels outside the grid boundaries, and to efficiently handle pixels that have already been filled with the desired color to optimize the algorithm's performance. Overall, the flood fill algorithm provides an effective means of filling regions in two-dimensional grids, making it valuable in various graphics-related applications.
