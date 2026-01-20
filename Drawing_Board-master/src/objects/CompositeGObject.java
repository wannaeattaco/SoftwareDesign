package objects;

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
		gObjects.add(gObject);
		recalculateRegion();
	}

	public void remove(GObject gObject) {
		gObjects.remove(gObject);
		recalculateRegion();
	}

	@Override
	public void move(int dX, int dY) {
		for (GObject g : gObjects) {
			g.move(dX, dY);
		}
		recalculateRegion();
	}

	public void recalculateRegion() {
		if (gObjects.isEmpty()) {
			x = y = width = height = 0;
			return;
		}

		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

		for (GObject g : gObjects) {
			minX = Math.min(minX, g.x);
			minY = Math.min(minY, g.y);
			maxX = Math.max(maxX, g.x + g.width);
			maxY = Math.max(maxY, g.y + g.height);
		}

		x = minX;
		y = minY;
		width = maxX - minX;
		height = maxY - minY;
	}

	@Override
	public void paintObject(Graphics g) {
		for (GObject go : gObjects) {
			go.paintObject(g);
		}
	}

	@Override
	public void paintLabel(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("Group", x + width / 2, y - 5);
	}
}
