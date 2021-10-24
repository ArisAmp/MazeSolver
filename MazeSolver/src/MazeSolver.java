import java.util.LinkedList;

public class MazeSolver {
	
	static int[][] maze = {
			{2, 0, 1, 1},
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	};
	//0 == wall
	//1 == path
	//2 == destination
	
	static LinkedList<Position> path = new LinkedList<Position>(); //"Stack" to store the path to destination.
	
	
	//Method to find and output the path to solution.
	public static void checkMazeSolution(int[][] maze, Position start) {
		
		while(maze[start.getPositionX()][start.getPositionY()] != 2) {
			
		}
		
		
	}

	public static void main(String[] args) {
		Position p = new Position(0,3);
		
		path.push(p);
		
		System.out.println(p.getPosition());
	}

}
