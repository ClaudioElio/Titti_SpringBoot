package it.mariani.titti.utility;
import org.slf4j.LoggerFactory;

public class Slf4jLoggerAdapater implements Logger {
    private final String loggerName;
    private transient org.slf4j.Logger delegate;

    protected Slf4jLoggerAdapater(String loggerName) {
        this.loggerName = loggerName;
        init();
    }
    private void init() {
        this.delegate = LoggerFactory.getLogger(loggerName);
    }

    @Override
    public void debug(String format, Object... argArray) {
        delegate.debug(format, argArray);
    }
    
    @Override
    public void info(String format, Object... argArray) {
        delegate.info(format, argArray);
    }
    
    @Override
    public void error(String format, Throwable t, Object... argArray) {
        delegate.error(format, t, argArray);
    }

    public String getName() {
        return delegate.getName();
    }
}
