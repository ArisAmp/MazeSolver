import java.util.LinkedList;

public class Maze {
	public int[][] maze;
	public LinkedList<Position> path = new LinkedList<Position>(); //"Stack" to store the path to destination.
	public Position start;
	
	
	
	
	public void printPath() {
		while(!path.isEmpty()) {
			System.out.print(" -> " + path.peekLast().getPosition());
			path.removeLast();
		}	
	}
	
	public void printMaze() {
		
		System.out.println("\nMAZE:");
		
		for(int i=0; i<maze.length; i++) {
			for(int j=0; j<maze[i].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
}
