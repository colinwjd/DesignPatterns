package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * 当调用被代理的类的实例的方法时系统将转到包含代理类（Proxy） 的InvocationHandler的invoke方法中去执行相应代码,
 * 这样就可以在不修改代码的前提下为已经存在的类来添加新的功能。
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 13, 2014
 */
public class ProxyTest {

	public static void main(String[] args) {

		Object[] elements = new Object[1000];

		for (int i = 0; i < elements.length; i++) {
			// 创建被代理的对象
			Integer value = i + 1;
			// 创建请求处理器对象
			InvocationHandler handler = new TracHandler(value);
			// 创建代理
			Object proxy = Proxy.newProxyInstance(null,
					new Class[] { Comparable.class }, handler);
			// 把每一个代理对象放入数组
			elements[i] = proxy;
		}
		// 要查找的值
		Integer key = new Random().nextInt(elements.length) + 1;
		// 调用二分法，检索key在数组中的位置
		int result = Arrays.binarySearch(elements, key);

		if (result > 0) {
			System.out.println(elements[result]);
		}
	}

}
