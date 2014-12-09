package flyweightpattern;

import java.util.HashMap;

/**
 * 形状工厂，生成基于给定信息的实体类的对象，通过该工厂控制形状对象的创建
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 9, 2014
 */
public class ShapeFactory {

	// 在HashMap中存储形状对象，当需要一个形状对象的时候，直接从该HashMap中取
	// 免去了创建对象的开销
	private static final HashMap<String, Shape> circleHashMap = new HashMap<>();

	public static Shape getCircle(String color) {
		// 从HashMap中取一个圆形对象
		Circle circle = (Circle) circleHashMap.get(color);

		// 如果该HashMap中还没有需要的对象，则创建一个，并放入HashMap中
		// 这样下次需要该对象的时候就不需要重新创建了
		if (circle == null) {
			circle = new Circle(color);
			circleHashMap.put(color, circle);
			System.out.println("Creating circle of color:" + color);
		}

		return circle;
	}

}
