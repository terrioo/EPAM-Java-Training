package by.epam.javatraining.baklaga.maintask02.controller;

import by.epam.javatraining.baklaga.maintask02.exception.NullArrayException;
import by.epam.javatraining.baklaga.maintask02.exception.WrongDataException;
import by.epam.javatraining.baklaga.maintask02.model.car.Car;
import by.epam.javatraining.baklaga.maintask02.model.logic.Logic;
import by.epam.javatraining.baklaga.maintask02.utility.Initializer;
import by.epam.javatraining.baklaga.maintask02.view.Info;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger log = Logger.getRootLogger();

    public static void main(String[] args) throws NullArrayException, WrongDataException {
        Initializer Data = new Initializer();
        Car[] transport = Data.initialize();

        Info.printInfoAboutTaksopark(transport);
        Info.print("Total price of all cars of taxopark is " + Logic.calcPrice(transport));
        Info.print("The cheapest car in taxopark is " + Logic.findCheapestCar(transport));
        Info.print("The most expensive car in taxopark is " + Logic.findMostExpensiveCar(transport));
        Info.print("The car with the lowest rental price per hour is " + Logic.findMinPrice(transport));
        Info.print("The car with the highest rental price per hour is " + Logic.findMaxPrice(transport));
        Info.print("Cars with price per hour less than 20BYN are: ");
        Info.printList(Logic.findRightPrice(transport));
        Info.print("Cars sort by price per hour:");
        Logic.bubbleSortByPricePerHour(transport);
        Info.printInfoAboutTaksopark(transport);
        Info.print("Cars sort by fuel consumption:");
        Logic.selectionSortByFuelConsumption(transport);
        Info.printInfoAboutTaksopark(transport);
    }
}
