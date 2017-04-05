package object;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval extends GObject {

	private Color color;
	
	public Oval(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void paintObject(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
	}
	
	@Override
	public void paintLabel(Graphics g) {
		g.drawString("Oval", this.x, this.y);
	}
	
}