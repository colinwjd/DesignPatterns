package chainofresponsibilitypattern;

public class ChainPatternDemo {

	/**
	 * 取得日志记录器链
	 * 
	 * @return
	 */
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

		// 设置错误日志记录器的下一个日志记录器为文件日志记录器
		errorLogger.setNextLogger(fileLogger);

		// 设置文件日志记录器的下一个日志记录器为控制台日志记录器
		fileLogger.setNextLogger(consoleLogger);

		// 返回链头
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		// 日志级别为INFO时，consoleLogger会做记录
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		System.out.println();

		// 日志级别为DEBUG时，consoleLogger，和fileLogger会做记录
		loggerChain.logMessage(AbstractLogger.DEBUG,
				"This is an debug level information.");
		System.out.println();

		// 日志级别为ERROR时，三个记录器都会做记录
		loggerChain.logMessage(AbstractLogger.ERROR,
				"This is error information.");
	}

}
