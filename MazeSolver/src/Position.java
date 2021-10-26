
public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getPosition() {
		return "("+this.x + "," + this.y+")";
	}
	
	public int getPositionX() {
		return this.x;
	}
	
	public int getPositionY() {
		return this.y;
	}
}
