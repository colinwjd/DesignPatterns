package org.colin.decoratorpattern;

/**
 * 实现了 Shape 接口的抽象装饰器
 * 
 * @author Colin
 *
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
