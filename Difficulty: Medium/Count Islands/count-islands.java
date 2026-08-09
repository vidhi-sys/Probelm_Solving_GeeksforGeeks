class Solution {
    public int countIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == 'L') {
                    dfs(i, j, grid, vis);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(int i, int j, char[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;

        // Base checks: Out of bounds, water ('0'), or already visited
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 'W' || vis[i][j]) {
            return;
        }

        // Mark current cell as visited
        vis[i][j] = true;

        // 4 Cardinal directions (Horizontal & Vertical)
        dfs(i - 1, j, grid, vis);     // Up
        dfs(i + 1, j, grid, vis);     // Down
        dfs(i, j - 1, grid, vis);     // Left
        dfs(i, j + 1, grid, vis);     // Right

        // 4 Diagonal directions
        dfs(i - 1, j - 1, grid, vis); // Top-Left
        dfs(i - 1, j + 1, grid, vis); // Top-Right
        dfs(i + 1, j - 1, grid, vis); // Bottom-Left
        dfs(i + 1, j + 1, grid, vis); // Bottom-Right
    }
}