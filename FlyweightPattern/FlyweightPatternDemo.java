package flyweightpattern;

public class FlyweightPatternDemo {

	// 定义几个不同的颜色
	private static final String colors[] = { "Red", "Green", "Blue", "White",
			"Black" };

	/**
	 * 取得一个随机的颜色
	 * 
	 * @return
	 */
	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	/**
	 * 取得一个随机横坐标值
	 * 
	 * @return
	 */
	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	/**
	 * 取得一个随机纵坐标值
	 * 
	 * @return
	 */
	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {

			// 当需要一个图形对象的时候，从图形工厂去取，图形工厂会控制是否创建新的图形对象
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());

			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(30);
			
			circle.draw();
		}
	}

}
