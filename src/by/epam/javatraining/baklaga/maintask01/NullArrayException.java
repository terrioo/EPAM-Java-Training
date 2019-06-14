package by.epam.javatraining.baklaga.maintask01;

import org.apache.log4j.Logger;

public class NullArrayException extends Exception {
    private static final Logger LOGGER = Logger.getRootLogger();

    public NullArrayException(String message) {
        super(message);
        LOGGER.warn("Vector is null. It's length must be greater than 0.");
    }
}
