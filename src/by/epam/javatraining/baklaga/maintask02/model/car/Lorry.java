package by.epam.javatraining.baklaga.maintask02.model.car;

import java.util.Objects;

public class Lorry extends Car {

    private int loadCapacity;

    public Lorry() {
        super();
    }

    public Lorry ( int horsePower, String model, String mark, int price, int pricePerHour, double fuelConsumption,
                   boolean childSeat, boolean onService, int loadCapacity){
        super( horsePower, model, mark, price, pricePerHour, fuelConsumption, childSeat, onService);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return loadCapacity == lorry.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return  "Type - lorry:" +
                " horse power=" + getHorsePower() +
                ", model='" + getModel() + '\'' +
                ", mark='" + getMark() + '\'' +
                ", price of car ($)=" + getPrice() +
                ", price (BYN/hour)=" + getPricePerHour() +
                ", fuel consumption (l/100km)=" + getFuelConsumption() +
                ", has child seat -" + isChildSeat() +
                ", on service -" + isOnService() +
                ", load capacity (ton)=" + loadCapacity;
    }
}