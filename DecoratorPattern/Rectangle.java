package org.colin.decoratorpattern;

/**
 * 三角形
 * 
 * @author Colin
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape:Rectangle");
	}

}
