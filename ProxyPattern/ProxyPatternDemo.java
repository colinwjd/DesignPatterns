package org.colin.proxypattern;

/**
 * 代理模式测试
 * 
 * @author Colin
 *
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {

		String imageFileName = "testProxy.png";

		Image image = new ProxyImage(imageFileName);

		// 第一次调用该方法，图像会从磁盘加载
		image.display();
		System.out.println();

		// 再次调用该方法，图像不会从磁盘加载
		// 因为图像代理对创建图像进行了控制
		image.display();

	}

}
