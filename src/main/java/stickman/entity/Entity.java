package stickman.entity;
import stickman.display.Display;
import stickman.entity.Image;
import stickman.entity.Point;

public abstract class Entity
{
	private int y=0;
	private int x=0;
	private volatile boolean alive = true;
	public Image img;
	public volatile Direction dir = Entity.Direction.NONE;
	public enum Direction {UP, DOWN, LEFT, RIGHT, NONE}

	public void setX(int x) {
		if( (x < (Display.SIZE_X-this.img.SIZE_X)) &&
			(x>=0) )
		{
			this.x = x;
		}
	}

	public void setY(int y) {
		if( (y < (Display.SIZE_Y-this.img.SIZE_Y)) &&
			(y>=0) )
		{
			this.y = y;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
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
