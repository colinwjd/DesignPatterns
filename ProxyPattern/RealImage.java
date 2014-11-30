package org.colin.proxypattern;

/**
 * 图像
 * 
 * @author Colin
 *
 */
public class RealImage implements Image {

	private String imageFileName;

	public RealImage(String imageFileName) {
		this.imageFileName = imageFileName;
		loadFromDisk(imageFileName);
	}

	/**
	 * 从磁盘中加载文件
	 * 
	 * @param imageFileName
	 */
	private void loadFromDisk(String imageFileName) {
		System.out.println("Loading " + imageFileName + " from disk!");
	}

	@Override
	public void display() {
		System.out.println("Displaying:" + this.imageFileName);
	}

}
