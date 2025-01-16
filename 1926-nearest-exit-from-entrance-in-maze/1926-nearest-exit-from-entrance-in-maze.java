import java.util.*;

class Solution {
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        visited[entrance[0]][entrance[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], steps = current[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // Check boundaries and if cell is already visited or blocked
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && !visited[nx][ny] && maze[nx][ny] == '.') {
                    // If it's an exit and not the entrance, return the steps
                    if ((nx == 0 || ny == 0 || nx == rows - 1 || ny == cols - 1) && (nx != entrance[0] || ny != entrance[1])) {
                        return steps + 1;
                    }

                    // Mark as visited and add to the queue
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, steps + 1});
                }
            }
        }

        return -1; // No exit found
    }
}
