package object;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompositeGObject extends GObject {

	private List<GObject> gObjects;

	public CompositeGObject() {
		super(0, 0, 0, 0);
		gObjects = new ArrayList<GObject>();
	}

	public void add(GObject gObject) {
		// TODO: Implement this method.
		gObjects.add(gObject);
	}

	public void remove(GObject gObject) {
		// TODO: Implement this method.
		gObjects.remove(gObject);
	}

	@Override
	public void move(int dX, int dY) {
		// TODO: Implement this method.
		for(GObject gObj : gObjects){
            gObj.move(dX, dY);
		}
	}
	
	public void recalculateRegion() {
		// TODO: Implement this method.
		
	}

	@Override
	public void paintObject(Graphics g) {
		for(GObject gObject : gObjects){
			gObject.paintObject(g);
		}
	}

	@Override
	public void paintLabel(Graphics g) {
		// TODO: Implement this method.
		g.drawString("group", x, y);
	}
	
}