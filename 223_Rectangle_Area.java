/**
 * Question:
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * 
 * Solution:
 * 总面积减去重叠的面积，记得先判断是否重叠
 */
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int totalArea = (C - A) * (D - B) + (G - E) * (H - F);
        int A1 = Math.max(A, E);
        int B1 = Math.max(B, F);
        int C1 = Math.min(C, G);
        int D1 = Math.min(D, H);
        if (A1 >= C1 || B1 >= D1) {
            return totalArea;
        }
        
        return totalArea - (C1 - A1) * (D1 - B1);
    }
}