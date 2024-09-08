public class RatInAMaze {
    public static boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]){
        //base case
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        //check if maze[x][y] is valid
        if(isSafe(maze,x,y)==true){
            if(sol[x][y]==1){
                return false;
                
            }sol[x][y]=1;
            if(solveMazeUtil(maze, x+1, y, sol)){
                return true;
            }
            if(solveMazeUtil(maze, x, y+1, sol)){
                return true;
                
            }sol[x][y]=0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
    }
}
