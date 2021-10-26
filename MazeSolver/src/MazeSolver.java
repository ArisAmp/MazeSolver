import java.io.FileNotFoundException;





public class MazeSolver {
	
		static int[][] m = {
				{2, 0, 1, 1},
				{1, 1, 1, 0},
				{0, 0, 0, 1},
		};
		
		
		
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
		if (x < 0 || y < 0 || y >= m.maze[x].length || x >= m.maze.length ) {
			return false;
		}
		return true;
	}
	

	public static void main(String[] args) throws FileNotFoundException {
//		List<Maze> mazes = new ArrayList<Maze>();
//		
//		
//		Scanner sc = new Scanner(new File("mazes.txt"));
//		int rows = sc.nextInt();
//		
//		for(int i=0; i<rows; i++) {
//			
//			
//			
//		}
//		
//		
//		
//		
//		int i=0;
//		
//		while (i < mazes.size()) {
//			if(checkMazeSolution(mazes.get(i))) {
//				System.out.println("You won. The path to get cheese is: "); 
//				mazes.get(i).printPath();
//			} else {
//				System.out.println("No path to get the cheese.");
//			}
//		}
		
		Maze maze = new Maze();
		
		maze.maze = m;
		maze.start = new Position(0,3);
		maze.printMaze();
		
		
		
		if(checkMazeSolution(maze)) {
			System.out.println("\nYou won! The path to get the cheese is: "); 
			maze.printPath();
		} else {
			System.out.println("\nNo path to get the cheese.");
		}
		
		
		
	}

}
