package by.epam.javatraining.baklaga.maintask02.utility;

import by.epam.javatraining.baklaga.maintask02.model.car.*;
import org.apache.log4j.Logger;

public class Initializer {
    private static final Logger log = Logger.getRootLogger();

    public Car[] taxopark = new Car[8];

    public Car[] initialize(){
        log.debug("Fill the taxi station with cars");
        Car sedanFord = new Sedan(215, "Ford", "Focus" , 11300, 15, 7.3, false, true, 350);
        taxopark[0] = sedanFord;
        Car sedanChevrolet = new Sedan(275, "Chevrolet", "Malibu", 8900, 17, 11.1, false, true, 380);
        taxopark[1] = sedanChevrolet;
        Car universalMitsubishi = new Universal(320, "Mitsubishi", "Galant", 6700, 13, 9.5, true, false, 7);
        taxopark[2] = universalMitsubishi;
        Car lorryFiat = new Lorry(700, "Fiat", "Ducato", 14500, 25, 14.2, false, true, 4);
        taxopark[3] = lorryFiat;
        Car lorryCitroen  = new Lorry(480, "Citroen ", "Jumper", 18900, 23, 13.5, false, true, 6);
        taxopark[4] = lorryCitroen;
        Car minibusVolkswagen = new Minibus(340, "Volkswagen", "T4", 21800, 25, 12.8, true, false, 250, 8);
        taxopark[5] = minibusVolkswagen;
        Car universalVolvo = new Universal(290, "Volvo", "XC70", 16700, 16, 10.5, true, true, 7);
        taxopark[6] = universalVolvo;
        Car universalKia = new Universal(320, "Kia", "Carnival", 11400, 12, 8.8, true, true, 7);
        taxopark[7] = universalVolvo;
        return taxopark;
    }
}
