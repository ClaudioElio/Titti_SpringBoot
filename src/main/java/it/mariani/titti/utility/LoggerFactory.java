package it.mariani.titti.utility;

public class LoggerFactory {

    private LoggerFactory() {
    }

    public static Logger getLogger(Class<?> clazz) {
        String loggerName = clazz.getName();
        loggerName = loggerName.replace("$", ".");
        return new Slf4jLoggerAdapater(loggerName);
    }

    public static Logger getLogger(String loggerName) {
        return new Slf4jLoggerAdapater(loggerName);
    }

}
