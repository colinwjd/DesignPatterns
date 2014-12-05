package org.colin.observerpattern;

import java.util.ArrayList;

/**
 * 主题（被观察）
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 5, 2014
 */
public class Subject {
	// 主题保存所有观察者的引用
	private ArrayList<Observer> observers = new ArrayList<>();
	// 主题的状态
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		// 当主题的状态发生改变时通知所有的观察者
		notifyAllObservers();
	}

	/**
	 * 给该主题增加一个观察者
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 通知所有的观察者
	 */
	private void notifyAllObservers() {
		for (Observer observer : observers) {
			// 每当观察者收到通知时，就调用自身的update()方法
			observer.update();
		}
	}
}
