package org.colin.proxypattern;

/**
 * 图像代理
 * 
 * @author Colin
 *
 */
public class ProxyImage implements Image {

	// 代理类应持有一个被代理类的对象，以对其加以控制
	private RealImage realImage;
	private String imageFileName;

	public ProxyImage(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	@Override
	public void display() {
		// 在调用realImage对象的display()方法前可以对其进行控制
		if (realImage == null) {
			realImage = new RealImage(imageFileName);
		}

		realImage.display();
	}

}
