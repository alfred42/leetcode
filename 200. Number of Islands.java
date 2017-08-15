public class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        
        int[][] tag = new int[grid.length][grid[0].length];
        
        int maxIsland = 0;
                    
        Stack<Integer> istack = new Stack<>();
        Stack<Integer> jstack = new Stack<>();
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && tag[i][j] == 0) {
                    tag[i][j] = ++maxIsland;
                    System.out.println(i + " " + j);
                    
                    istack.push(i);
                    jstack.push(j);
                    
                    while (istack.size() > 0) {
                        int itemp = istack.pop();
                        int jtemp = jstack.pop();
                        System.out.println("---" + itemp + " " + jtemp);
                        
                        if (itemp > 0 && grid[itemp - 1][jtemp] == '1' && tag[itemp - 1][jtemp] == 0) {
                            tag[itemp - 1][jtemp] = maxIsland;
                            istack.push(itemp - 1);
                            jstack.push(jtemp);
                        } 
                        if (itemp < grid.length - 1 && grid[itemp + 1][jtemp] == '1' && tag[itemp + 1][jtemp] == 0) {
                            tag[itemp + 1][jtemp] = maxIsland;
                            istack.push(itemp + 1);
                            jstack.push(jtemp);
                        }
                        if (jtemp > 0 && grid[itemp][jtemp - 1] == '1' && tag[itemp][jtemp - 1] == 0) {
                            tag[itemp][jtemp - 1] = maxIsland;
                            istack.push(itemp);
                            jstack.push(jtemp - 1);
                        } 
                        if (jtemp < grid[0].length - 1 && grid[itemp][jtemp + 1] == '1' && tag[itemp][jtemp + 1] == 0) {
                            tag[itemp][jtemp + 1] = maxIsland;
                            istack.push(itemp);
                            jstack.push(jtemp + 1);
                        }
                    }
                }
            }
        }
        
        return maxIsland;
        
    }
}