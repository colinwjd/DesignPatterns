package flyweightpattern;

/**
 * 圆形
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 9, 2014
 */
public class Circle implements Shape {

	// 颜色
	private String color;
	// 圆心横坐标
	private int x;
	// 圆心纵坐标
	private int y;
	// 圆的半径长度
	private int radius;

	public Circle(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x
				+ ", y :" + y + ", radius :" + radius);
	}

}
