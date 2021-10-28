import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;





public class MazeSolver {
	
	//0 == wall
	//1 == path
	//2 == destination
	
	public static void main(String[] args) throws FileNotFoundException {	
		System.out.println("*** MAZE - SOLVER ***\n(0 = wall\n 1 = path\n 2 = destination).");
		
		List<Maze> mazes = readMazes();
		
		
		int i =0;
		while (i < mazes.size()) {
			mazes.get(i).printMaze();
			System.out.println();
			
			if(checkMazeSolution(mazes.get(i))) {
				System.out.println("You won! The path to get cheese starting from " + mazes.get(i).start.getPosition() +" is: "); 
				mazes.get(i).printPath();
				System.out.println();
			} else {
				System.out.println("No path to get the cheese starting from "  + mazes.get(i).start.getPosition() + ".");
				System.out.println();
				
			}
			
			i++;
		}

	}
	
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
					System.out.println("Moved up.");
					return true;
				} else if (m.maze[x - 1][y] == 1) {
					System.out.println("Moved up.");
					m.path.push(new Position(x - 1,y));
					continue;
				}
			}
			
			
			//left
			if(isValid(x, y - 1, m)) {
				if(m.maze[x][y - 1] == 2) {
					System.out.println("Moved left.");
					return true;
				} else if (m.maze[x][y - 1] == 1) {
					System.out.println("Moved left.");
					m.path.push(new Position(x, y - 1));
					continue;
				}
			}
			
			
			//right
			if(isValid(x, y + 1, m)) {
				if(m.maze[x][y + 1] == 2) {
					System.out.println("Moved right.");
					return true;
				} else if (m.maze[x][y + 1] == 1) {
					System.out.println("Moved right.");
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
		if (x < 0 || x >= m.maze.length || y < 0 || y >= m.maze[x].length  ) {
			return false;
		}
		return true;
	}
	


	private static List<Maze> readMazes() throws FileNotFoundException {
		
		List<Maze> mazes = new ArrayList<Maze>();
		Scanner sc = new Scanner(new File("mazes.txt"));
		
		while(sc.hasNextLine()) {
			Maze m = new Maze();
			
			
			int rows = Integer.parseInt(sc.nextLine());
			m.maze = new int[rows][];
			
			
			for(int i=0; i<rows; i++) {
				String line = sc.nextLine();
				m.maze[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();	
			}
			
			
			m.start = new Position(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
			
			sc.nextLine();
			
			mazes.add(m);
		}
		
		
		
		return mazes;
		
	}

}
