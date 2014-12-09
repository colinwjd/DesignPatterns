package chainofresponsibilitypattern;

/**
 * 错误日志记录器
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 9, 2014
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}

}
