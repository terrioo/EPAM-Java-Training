package by.epam.javatraining.baklaga.maintask02.view;

import by.epam.javatraining.baklaga.maintask02.model.car.Car;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Info {
    private static final Logger log = Logger.getRootLogger();

    public static void printInfoAboutTaksopark(Car[] taxopark) {
        for (int i = 0; i < taxopark.length; i++) {
            log.info(taxopark[i].toString());
        }

    }

    public static void print(String msg) {
        log.info(msg);
    }

    public static void printList(ArrayList<Car> listOfCars) {
        for (int i = 0; i < listOfCars.size(); i++) {
            log.info(listOfCars.get(i).toString());
        }
    }
}
