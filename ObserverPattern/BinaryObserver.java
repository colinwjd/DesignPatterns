package org.colin.observerpattern;

/**
 * 二进制观察者
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 5, 2014
 */
public class BinaryObserver extends Observer {

	/**
	 * @param subject
	 *            要观察的主题
	 */
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: "
				+ Integer.toBinaryString(subject.getState()));
	}

}
