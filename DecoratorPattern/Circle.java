package org.colin.decoratorpattern;

/**
 * 圆形
 * 
 * @author Colin
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}

}
