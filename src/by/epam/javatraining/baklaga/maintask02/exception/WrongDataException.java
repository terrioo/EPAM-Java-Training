package by.epam.javatraining.baklaga.maintask02.exception;

import org.apache.log4j.Logger;

public class WrongDataException extends BasicException {
    private static final Logger log = Logger.getRootLogger();
    public WrongDataException() {
        super("Wrong data. Value can't be 0 or less than 0");
        log.error("Wrong value");
    }
}
