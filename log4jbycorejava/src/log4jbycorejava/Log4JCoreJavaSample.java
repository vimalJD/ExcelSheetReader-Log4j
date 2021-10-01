package log4jbycorejava;

import org.apache.log4j.Logger;
import org.apache.log4j.Category.*;

public class Log4JCoreJavaSample {

	final static Logger logger = Logger.getLogger(Log4JCoreJavaSample.class);

	public void callMeInAppInfo(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.info("This is info : " + parameter);
		}
	}

	public void callMeInAppWarn(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.warn("This is warn : " + parameter);
		}
	}

	public void callMeInAppDebug(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.debug("This is Debug : " + parameter);
		}
	}

	public void callMeInAppError(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.error("This is error : " + parameter);
		}
	}

	public void callMeInAppFatal(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.fatal("This is fatal : " + parameter);
		}
	}
}
