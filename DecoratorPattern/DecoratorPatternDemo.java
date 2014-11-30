package org.colin.decoratorpattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape rectangle = new Rectangle();
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		circle.draw();
		redCircle.draw();

		rectangle.draw();
		redRectangle.draw();

	}

}
