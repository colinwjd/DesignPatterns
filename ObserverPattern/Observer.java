package org.colin.observerpattern;

/**
 * 抽象观察者
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 5, 2014
 */
public abstract class Observer {
	// 具体观察者应当持有主题的引用
	protected Subject subject;

	/**
	 * 观察者收到主题的通知时要调用的方法
	 */
	public abstract void update();
}
