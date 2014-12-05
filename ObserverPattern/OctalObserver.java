package org.colin.observerpattern;

/**
 * 八进制观察者
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 5, 2014
 */
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: "
				+ Integer.toOctalString(subject.getState()));
	}

}
