package chainofresponsibilitypattern;

/**
 * 控制台日志记录器
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 9, 2014
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}

}
