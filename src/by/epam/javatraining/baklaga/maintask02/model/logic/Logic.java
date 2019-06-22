package by.epam.javatraining.baklaga.maintask02.model.logic;


import by.epam.javatraining.baklaga.maintask02.exception.NullArrayException;
import by.epam.javatraining.baklaga.maintask02.exception.WrongDataException;
import by.epam.javatraining.baklaga.maintask02.model.car.Car;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Logic {
    private static final Logger log = Logger.getRootLogger();
    public static ArrayList<Car> listOfCars = new ArrayList<>();

    private static void arrayForExceptionCheck(Car[] transport) throws NullArrayException {
        log.debug("Check for null exception");
        if (transport == null || transport.length == 0) {
            throw new NullArrayException();
        }
    }

    private static void wrongDataExceptionCheck(Car[] transport) throws WrongDataException {
        log.debug("Check for wrong  data exception");
        for (int i = 0; i < transport.length; i++) {
            if (transport[i].getHorsePower() <= 0 || transport[i].getPrice() <= 0 || transport[i].getPricePerHour() <= 0
                    || transport[i].getFuelConsumption() <= 0) {
                throw new WrongDataException();
            }
        }
    }

    // Total price of all cars of taxopark;
    public static int calcPrice(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Find total price of all cars of taxopark");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        int sumPrices = 0;
        for (Car car : transport) {
            sumPrices += car.getPrice();
        }
        return sumPrices;
    }

    // The cheapest car;
    public static Car findCheapestCar(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Find the cheapest car in taxopark");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        int minPrice = transport[0].getPrice();
        int indexOfCarWithMinPrice = 0;
        for (int i = 0; i < transport.length; i++) {
            int tmp = transport[i].getPrice();
            if (tmp < minPrice) {
                minPrice = transport[i].getPrice();
                indexOfCarWithMinPrice = i;
            }
        }
        return transport[indexOfCarWithMinPrice];
    }

    //The most expensive car;
    public static Car findMostExpensiveCar(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Find the most expensive car in taxopark");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        int maxPrice = 0;
        int indexOfCarWithMaxPrice = 0;
        for (int i = 0; i < transport.length; i++) {
            int carPrice = transport[i].getPrice();
            if (carPrice > maxPrice) {
                maxPrice = transport[i].getPrice();
                indexOfCarWithMaxPrice = i;
            }
        }
        return transport[indexOfCarWithMaxPrice];
    }

    // The lowest rental price per hour;
    public static Car findMinPrice(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Find the car with the lowest rental price per hour");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        int minPrice = transport[0].getPricePerHour();
        int indexOfCarWithMinPrice = 0;
        for (int i = 0; i < transport.length; i++) {
            int tmp = transport[i].getPricePerHour();
            if (tmp < minPrice) {
                minPrice = transport[i].getPricePerHour();
                indexOfCarWithMinPrice = i;
            }
        }
        return transport[indexOfCarWithMinPrice];
    }

    // The highest rental price per hour;
    public static Car findMaxPrice(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Find the car with the highest rental price per hour");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        int maxPrice = 0;
        int indexOfCarWithMaxPrice = 0;
        for (int i = 0; i < transport.length; i++) {
            int carPrice = transport[i].getPricePerHour();
            if (carPrice > maxPrice) {
                maxPrice = transport[i].getPricePerHour();
                indexOfCarWithMaxPrice = i;
            }
        }
        return transport[indexOfCarWithMaxPrice];
    }

    // Car with price per hour less than 20BYN listOfCars;
    public static ArrayList<Car> findRightPrice(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Find cars with price per hour less than 20BYN and sort ascending");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        bubbleSortByPricePerHour(transport);
        for (int i = 0; i < transport.length; i++) {
            if (transport[i].getPricePerHour() < 20) {
                listOfCars.add(transport[i]);
            }
        }
        return listOfCars;
    }

    private static void exchangeElements(Car[] transport, int index1, int index2) {
        log.debug("Swap elements of array");
        Car newValue = transport[index1];
        transport[index1] = transport[index2];
        transport[index2] = newValue;
    }

    // Sort by price per hour;
    public static void bubbleSortByPricePerHour(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Cars sort by price per hour");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        for (int i = transport.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (transport[j].getPricePerHour() > transport[j + 1].getPricePerHour()) {
                    exchangeElements(transport, j, j + 1);
                }
            }
        }
    }

    // Sort by fuel consumption;
    public static void selectionSortByFuelConsumption(Car[] transport) throws NullArrayException, WrongDataException {
        log.debug("Cars sort by fuel consumption");
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        for (int i = 0; i < transport.length; i++) {
            double min = transport[i].getFuelConsumption();
            int min_i = i;
            for (int j = i + 1; j < transport.length; j++) {
                if (transport[j].getFuelConsumption() < min) {
                    min = transport[j].getFuelConsumption();
                    min_i = j;
                }
            }
            if (i != min_i) {
                exchangeElements(transport, i, min_i);
            }
        }
    }
}






/*
 //
    public int trunkVolSum(Car[] transport) throws NullArrayException{
        arrayForExceptionCheck(transport);
        int trunkVolSum = 0;
        for (Car car : transport) {
            if (car instanceof Sedan) {
                Sedan sCar = (Sedan) car;
                trunkVolSum += sCar.getTrunkVol();
            } else if (car instanceof Minibus) {
                Minibus trCar = (Minibus) car;
                trunkVolSum += trCar.getTrunkVol();
            }
        }
        return trunkVolSum;
    }

    public int calcSeats(Car[] transport) throws NullArrayException {
        arrayForExceptionCheck(transport);
        int seatsSum = 0;
        for (Car car : transport) {
            if (car instanceof Universal) {
                Universal uCar = (Universal) car;
                seatsSum += uCar.getSeats();
            } else if (car instanceof Minibus) {
                Minibus trCar = (Minibus) car;
                seatsSum += trCar.getSeats();
            }
        }
        return seatsSum;
    }


    // Sort by price per hour
    public void bubbleSortByPricePerHour(Car[] transport) throws NullArrayException, WrongDataException {
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        for (int i = transport.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (transport[j].getPricePerHour() > transport[j + 1].getPricePerHour()) {
                    Car tmp = transport[j];
                    transport[j] = transport[j + 1];
                    transport[j + 1] = tmp;
                }
            }
        }
    }

    // Sort by HorsePower
    public void selectionSortByHorsePower(Car[] transport) throws NullArrayException, WrongDataException {
        arrayForExceptionCheck(transport);
        wrongDataExceptionCheck(transport);
        for (int i = 0; i < transport.length; i++) {
            int min = transport[i].getHorsePower();
            int min_i = i;
            for (int j = i + 1; j < transport.length; j++) {
                if (transport[j].getHorsePower() < min) {
                    min = transport[j].getHorsePower();
                    min_i = j;
                }
            }
            if (i != min_i) {
                Car tmp = transport[i];
                transport[i] = transport[min_i];
                transport[min_i] = tmp;
            }
        }
    }




 */