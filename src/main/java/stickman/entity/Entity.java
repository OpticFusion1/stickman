package stickman.entity;
import stickman.display.Display;
import stickman.entity.Image;
import stickman.entity.Point;

public class Entity
{
	public Point position = new Point(0,0);
	private volatile boolean alive = true;
	public Image img;
	public Speed speed = new Speed(0,0);
	public volatile Direction dir = Entity.Direction.NONE;
	public enum Direction {NONE, UP, DOWN, LEFT, RIGHT}

	public void setX(int x) {
		//if((x < (Display.SIZE_X - img.size.x)) & (x >= 0))
			position.x = x;
	}

	public void setY(int y) {
		//if((y < (Display.SIZE_Y - img.size.y)) && (y >= 0))
			position.y = y;
	}

	public int getX() {
		return position.x;
	}

	public int getY() {
		return position.y;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public void kill() {
		this.alive = false;
	}

	public void setAlive() {
		this.alive = true;
	}
}
