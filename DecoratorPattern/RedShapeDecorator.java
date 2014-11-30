package org.colin.decoratorpattern;

/**
 * 装饰器
 * 
 * @author Colin
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		super.draw();
		setRedBorder(super.decoratedShape);
	}

	private void setRedBorder(Shape decoratorShape) {
		System.out.println("Border Color: Red");
	}

}
