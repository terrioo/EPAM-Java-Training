package by.epam.javatraining.baklaga.maintask02.exception;

import org.apache.log4j.Logger;

public class NullArrayException extends BasicException {
    private static final Logger log = Logger.getRootLogger();
    public NullArrayException() {
        super("Array is not defined!");
        log.error("Array is null. Cars are absent");
    }
}
