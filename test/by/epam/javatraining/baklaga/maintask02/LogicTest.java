package by.epam.javatraining.baklaga.maintask02.model.logic;

import by.epam.javatraining.baklaga.maintask02.exception.NullArrayException;
import by.epam.javatraining.baklaga.maintask02.exception.WrongDataException;
import by.epam.javatraining.baklaga.maintask02.model.car.*;
import by.epam.javatraining.baklaga.maintask02.utility.Initializer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LogicTest {
    Initializer Data = new Initializer();
    Car[] transport = Data.initialize();

    Car[] taxoparkExpected = new Car[8];
    Car sedanFord = new Sedan(215, "Ford", "Focus", 11300, 15, 7.3, false, true, 350);
    Car sedanChevrolet = new Sedan(275, "Chevrolet", "Malibu", 8900, 17, 11.1, false, true, 380);
    Car universalMitsubishi = new Universal(320, "Mitsubishi", "Galant", 6700, 13, 9.5, true, false, 7);
    Car lorryFiat = new Lorry(700, "Fiat", "Ducato", 14500, 25, 14.2, false, true, 4);
    Car lorryCitroen = new Lorry(480, "Citroen ", "Jumper", 18900, 23, 13.5, false, true, 6);
    Car minibusVolkswagen = new Minibus(340, "Volkswagen", "T4", 21800, 25, 12.8, true, false, 250, 8);
    Car universalVolvo = new Universal(290, "Volvo", "XC70", 16700, 16, 10.5, true, true, 7);
    Car universalKia = new Universal(320, "Kia", "Carnival", 11400, 12, 8.8, true, true, 7);


    @Test(expected = NullArrayException.class)
    public void arrayForExceptionCheckNull() throws NullArrayException {
        Car[] transport = null;
        Logic.arrayForExceptionCheck(transport);
    }

    @Test(expected = NullArrayException.class)
    public void arrayForExceptionCheckNull2() throws NullArrayException {
        Car[] transport = new Car[]{};
        Logic.arrayForExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckNegativeHorsePower() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(-700, "Fiat", "Ducato", 10, 25, 14.2, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckZeroHorsePower() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(0, "Fiat", "Ducato", 10, 25, 14.2, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckNegativePrice() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(700, "Fiat", "Ducato", -10, 25, 14.2, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckZeroPrice() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(700, "Fiat", "Ducato", 0, 25, 14.2, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckNegativePricePerHour() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(700, "Fiat", "Ducato", 10, -25, 14.2, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckPricePerHour() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(700, "Fiat", "Ducato", 10, 0, 14.2, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckNegativeFuelConsumption() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(700, "Fiat", "Ducato", 10, 25, -14.2, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }

    @Test(expected = WrongDataException.class)
    public void wrongDataExceptionCheckPriceFuelConsumption() throws WrongDataException {
        Car lorryFiatNegative = new Lorry(700, "Fiat", "Ducato", 10, 250, 0, false, true, 4);
        transport[3] = lorryFiatNegative;
        Logic.wrongDataExceptionCheck(transport);
    }


    @Test
    public void calcPrice() throws NullArrayException, WrongDataException {
        int expected = 110200;
        assertEquals(expected, Logic.calcPrice(transport));

    }

    @Test
    public void findCheapestCar() throws NullArrayException, WrongDataException {
        Car expected = transport[2];
        assertEquals(expected, Logic.findCheapestCar(transport));
    }

    @Test
    public void findMostExpensiveCar() throws NullArrayException, WrongDataException {
        Car expected = transport[5];
        assertEquals(expected, Logic.findMostExpensiveCar(transport));
    }

    @Test
    public void findMinPrice() throws NullArrayException, WrongDataException {
        Car expected = transport[7];
        assertEquals(expected, Logic.findMinPrice(transport));
    }

    @Test
    public void findMaxPrice() throws NullArrayException, WrongDataException {
        Car expected = transport[3];
        assertEquals(expected, Logic.findMaxPrice(transport));
    }

    @Test
    public void findRightPrice() throws NullArrayException, WrongDataException {
        ArrayList<Car> expectedList = new ArrayList<>();
        expectedList.add(new Universal(320, "Kia", "Carnival", 11400, 12, 8.8, true, true, 7));
        expectedList.add(new Universal(320, "Mitsubishi", "Galant", 6700, 13, 9.5, true, false, 7));
        expectedList.add(new Sedan(215, "Ford", "Focus", 11300, 15, 7.3, false, true, 350));
        expectedList.add(new Universal(290, "Volvo", "XC70", 16700, 16, 10.5, true, true, 7));
        expectedList.add(new Sedan(275, "Chevrolet", "Malibu", 8900, 17, 11.1, false, true, 380));
        Assert.assertEquals(expectedList, Logic.findRightPrice(transport));
    }

    @Test
    public void bubbleSortByPricePerHour() throws NullArrayException, WrongDataException {
        Car[] taxoparkExpected = new Car[8];
        taxoparkExpected[0] = universalKia;
        taxoparkExpected[1] = universalMitsubishi;
        taxoparkExpected[2] = sedanFord;
        taxoparkExpected[3] = universalVolvo;
        taxoparkExpected[4] = sedanChevrolet;
        taxoparkExpected[5] = lorryCitroen;
        taxoparkExpected[6] = lorryFiat;
        taxoparkExpected[7] = minibusVolkswagen;
        Logic.bubbleSortByPricePerHour(transport);
        Assert.assertEquals(taxoparkExpected, transport);
    }

    @Test
    public void selectionSortByFuelConsumption() throws NullArrayException, WrongDataException {
        Car[] taxoparkExpected = new Car[8];
        taxoparkExpected[0] = sedanFord;
        taxoparkExpected[1] = universalKia;
        taxoparkExpected[2] = universalMitsubishi;
        taxoparkExpected[3] = universalVolvo;
        taxoparkExpected[4] = sedanChevrolet;
        taxoparkExpected[5] = minibusVolkswagen;
        taxoparkExpected[6] = lorryCitroen;
        taxoparkExpected[7] = lorryFiat;
        Logic.selectionSortByFuelConsumption(transport);
        Assert.assertEquals(taxoparkExpected, transport);
    }
}