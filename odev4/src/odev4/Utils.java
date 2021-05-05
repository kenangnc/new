package odev4;

public class Utils {
	public static void dogrulama(Logger[]loggers,String message) {
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}

}
