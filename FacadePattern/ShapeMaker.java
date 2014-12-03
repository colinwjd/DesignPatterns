package org.colin.facadepattern;

/**
 * 外观类
 * 
 * @author Colin
 *
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void diraRectangle() {
		rectangle.draw();
	}
}
