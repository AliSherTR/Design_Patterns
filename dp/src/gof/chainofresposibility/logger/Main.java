package gof.chainofresposibility.logger;
public class Main {

    // 1st chain of loggers
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger standardLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger warnLogger = new DatabaseLogger(AbstractLogger.WARNING);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(standardLogger);
        standardLogger.setNextLogger(warnLogger);

        return errorLogger;
    }

    // second chain of loggers
    private static AbstractLogger getCustomizedChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger warnLogger = new DatabaseLogger(AbstractLogger.WARNING);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(warnLogger);
        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");

        loggerChain.logMessage(AbstractLogger.WARNING,
                "This is a WARNING.");

        loggerChain = getCustomizedChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.ERROR , "Error from the second logger");
    }


}