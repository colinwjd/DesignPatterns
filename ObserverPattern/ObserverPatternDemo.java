package org.colin.observerpattern;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		// 建立主题（被观察者）
		Subject subject = new Subject();
		// 让octalObserver观察主题
		Observer octalObserver = new OctalObserver(subject);
		// 让binaryObserver也观察主题
		Observer binaryObserver = new BinaryObserver(subject);

		// 改变主题的状态
		subject.setState(15);
		System.out.println();
		// 再次改变主题的状态
		subject.setState(3);
	}
}
