package org.colin.facadepattern;

/**
 * 外观模式示例，为子系统中的一组接口提供一个一致的界面。 外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 降低了访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。 缺点是不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
 * 
 * @author Colin
 *
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		// 不需要单独实例化一个Rectangle对象
		// 将复杂的逻辑交给外观类处理
		shapeMaker.diraRectangle();
		shapeMaker.drawCircle();
	}

}
