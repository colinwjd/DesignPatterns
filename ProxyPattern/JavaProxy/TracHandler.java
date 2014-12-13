package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理实例的调用处理程序
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 13, 2014
 */
public class TracHandler implements InvocationHandler {
	// 被代理的对象
	private Object target;

	public TracHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Befor method!");
		System.out.print(target);
		// 取得调用的方法名
		System.out.print("." + method.getName() + "(");

		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
				if (i < args.length - 1) {
					System.out.print(",");
				}
			}
		}

		System.out.println(")");
		System.out.println("After method!");
		// 调用原始对象的方法
		return method.invoke(target, args);
	}

}
