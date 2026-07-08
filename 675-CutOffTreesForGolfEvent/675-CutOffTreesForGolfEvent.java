// Last updated: 7/8/2026, 3:57:05 PM
public class Solution {
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int cutOffTree(List<List<Integer>> grid) {
        if (grid == null || grid.isEmpty() || grid.get(0).isEmpty()) return 0;
        
        int m = grid.size();
        int n = grid.get(0).size();
        
        List<int[]> trees = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) > 1) {
                    trees.add(new int[]{grid.get(i).get(j), i, j});
                }
            }
        }
        
        Collections.sort(trees, (a, b) -> Integer.compare(a[0], b[0]));
        
        int totalSteps = 0;
        int startRow = 0;
        int startCol = 0;
        
        for (int[] tree : trees) {
            int targetRow = tree[1];
            int targetCol = tree[2];
            
            int steps = bfs(grid, startRow, startCol, targetRow, targetCol, m, n);
            if (steps == -1) return -1; 
            
            totalSteps += steps;
            startRow = targetRow;
            startCol = targetCol;
        }
        
        return totalSteps;
    }
    
    private int bfs(List<List<Integer>> grid, int sr, int sc, int tr, int tc, int m, int n) {
        if (sr == tr && sc == tc) return 0;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        
        queue.add(new int[]{sr, sc});
        visited[sr][sc] = true;
        int steps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                
                if (r == tr && c == tc) return steps;
                
                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc] && grid.get(nr).get(nc) != 0) {
                        queue.add(new int[]{nr, nc});
                        visited[nr][nc] = true;
                    }
                }
            }
            steps++;
        }
        
        return -1; 
    }
}
