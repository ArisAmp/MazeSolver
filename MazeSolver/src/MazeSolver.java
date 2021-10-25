import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MazeSolver {
	
	//0 == wall
	//1 == path
	//2 == destination
	
	
	//Method to find and output the path to solution.
	public static boolean checkMazeSolution(Maze m) {
		
		Position p = m.start;
		m.path.push(p);
		
		while(true) {
			int x = m.path.peek().getPositionX();
			int y = m.path.peek().getPositionY();
				
			m.maze[x][y] = 0;
			
			//down
			if(isValid(x + 1, y, m)) {
				if(m.maze[x + 1][y] == 2) {
					System.out.println("Moved down.");
					return true;
				} else if (m.maze[x + 1][y] == 1) {
					System.out.println("Moved down.");
					m.path.push(new Position(x + 1,y));
					continue;
				}
			}
			
			
			//up
			if(isValid(x - 1, y, m)) {
				if(m.maze[x - 1][y] == 2) {
					System.out.println("Moved down.");
					return true;
				} else if (m.maze[x - 1][y] == 1) {
					System.out.println("Moved down.");
					m.path.push(new Position(x - 1,y));
					continue;
				}
			}
			
			
			//left
			if(isValid(x, y - 1, m)) {
				if(m.maze[x][y - 1] == 2) {
					System.out.println("Moved down.");
					return true;
				} else if (m.maze[x][y - 1] == 1) {
					System.out.println("Moved down.");
					m.path.push(new Position(x, y - 1));
					continue;
				}
			}
			
			
			//right
			if(isValid(x, y + 1, m)) {
				if(m.maze[x][y + 1] == 2) {
					System.out.println("Moved down.");
					return true;
				} else if (m.maze[x][y + 1] == 1) {
					System.out.println("Moved down.");
					m.path.push(new Position(x, y + 1));
					continue;
				}
			}
			
			
			
			m.path.pop();
			System.out.println("Moved back.");
			
			if(m.path.size() <= 0) {
				return false;
			}
		}	
	}
	
	
	public static boolean isValid(int x, int y, Maze m) {
		if (x < 0 || y < 0 || y >= m.maze[x].length || x >= m.maze.length ) {
			return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		List<Maze> mazes = new ArrayList<Maze>();
		
		int i=0;
		
		while (i < mazes.size()) {
			if(checkMazeSolution(mazes.get(i))) {
				System.out.println("You won. The path to get cheese is: "); 
				mazes.get(i).printPath();
			} else {
				System.out.println("No path to get the cheese.");
			}
		}
	}

}
