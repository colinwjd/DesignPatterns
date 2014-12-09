package chainofresponsibilitypattern;

/**
 * 抽象日志记录器
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 9, 2014
 */
public abstract class AbstractLogger {

	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;

	// 日志记录级别
	protected int level;

	// 责任链中的下一个元素
	protected AbstractLogger nextLogger;

	/**
	 * 设置下一个记录器
	 * 
	 * @param nextLogger
	 */
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * 记录日志信息
	 * 
	 * @param level
	 * @param message
	 */
	public void logMessage(int level, String message) {
		// 当设置的日志级别高于默认级别时，记录日志信息
		if (this.level <= level) {
			write(message);
		}
		// 如果存在下一个日志记录器对象，则继续调用它的这个方法
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	/**
	 * 具体日志记录器要实现的方法
	 * 
	 * @param message
	 *            要记录的信息
	 */
	protected abstract void write(String message);

}
