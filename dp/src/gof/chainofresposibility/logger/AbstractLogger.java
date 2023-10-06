package gof.chainofresposibility.logger;
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public static int WARNING = 4;

    protected int level;
    protected AbstractLogger nextLogger;

    // next element in the chain of responsibility
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level , String message) {
        if(this.level <= level ) {
            write(message);
        }
        if(nextLogger != null) {
            nextLogger.logMessage(level , message);
        }
    }

    abstract protected void write(String message);
}
