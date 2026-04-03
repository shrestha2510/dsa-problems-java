class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int og = image[sr][sc];
        if(og == color){
            return image;
        }
        dfs(image, sr, sc, og, color);
        return image;
    }
    public static void dfs(int[][] image, int r, int c, int og, int color){
        if(r<0 || c<0 || r>= image.length || c>= image[0].length){
            return;
        }

        if(image[r][c] != og){
            return;
        }
        image[r][c] = color;
        dfs( image,  r+1, c, og, color);
        dfs( image,  r-1, c, og, color);
        dfs( image, r,  c+1,  og, color);
        dfs( image,  r,  c-1,  og,  color);
    }
}