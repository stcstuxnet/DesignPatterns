/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityPattern;

/**
 *
 * @author Ali-PC
 */
public class ChainOfResponsibilityPatternDemo {

    /**
     * @param args the command line arguments
     */
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ErrorLogger(AbstractLogger.INFO);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        return consoleLogger;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is error level information.");
    }

}
