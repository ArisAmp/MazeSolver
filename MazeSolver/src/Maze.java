import java.util.LinkedList;

public class Maze {
	public int[][] maze;
	public LinkedList<Position> path = new LinkedList<Position>(); //"Stack" to store the path to destination.
	public Position start;
	
	
	public void printPath() {
		for (Position p : path) {
			System.out.println(p + " ");
		}
	}
}
