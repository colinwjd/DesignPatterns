/**
 * 非线程安全的单例模式
 * @author Colin
 *
 */
public class Singleton {

	private static Singleton instance;

	// 私有构造方法，使得不能在外部实例化一个该类的对象
	private Singleton() {
		System.out.println("Create a new Instance!");
	}

	public static Singleton getInstance() {
		// 如果该类还不存在一个实例，则实例化一个
		if (instance == null) {
			instance = new Singleton();
		}
		// 如果该类存在实例则直接返回该实例
		return instance;
	}

}