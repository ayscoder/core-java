package corejava.solid;

/**
 * Depend on Abstraction not concretion
 * 
 * @author ayush
 *
 */
interface IShape {
	void draw();
}

class Circle implements IShape {

	@Override
	public void draw() {
	}
}

class Triangle implements IShape {

	@Override
	public void draw() {
	}
}

class DrawingTool {
	private IShape shape;

	public DrawingTool(IShape shape) {
		super();
		this.shape = shape;
	}

	public void setShape(IShape shape) {
		this.shape = shape;
	}

	public void draw() {
		shape.draw();
	}
}

public class Ioc {

	public Ioc() {
	}

	public static void main(String[] args) {
		IShape circle = new Circle();
		DrawingTool drawingTool = new DrawingTool(circle);
		drawingTool.draw();
	}

}
