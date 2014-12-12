package org.wjd.singleton;

/**
 * 线程安全的单例模式（非懒初始化）
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 12, 2014
 */
public class SingletonNotLazy {
	/*
	 * 类加载时就初始化，浪费内存。 它基于 classloder 机制避免了多线程的同步问题，不过，instance
	 * 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
	 * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
	 */
	private static SingletonNotLazy singletonNotLazy = new SingletonNotLazy();

	private SingletonNotLazy() {

	}

	public static SingletonNotLazy getInstance() {
		return singletonNotLazy;
	}
}
