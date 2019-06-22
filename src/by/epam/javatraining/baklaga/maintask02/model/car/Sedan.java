package by.epam.javatraining.baklaga.maintask02.model.car;

import java.util.Objects;

public class Sedan extends Car {

    private int trunkVolume;

    public Sedan() {
        super();
    }

    public Sedan(int horsePower, String model, String mark, int price, int pricePerHour, double fuelConsumption,
                 boolean childSeat, boolean onService, int trunkVolume) {
        super(horsePower, model, mark, price, pricePerHour, fuelConsumption, childSeat, onService);
        this.trunkVolume = trunkVolume;
    }

    public int getTrunkVol() {
        return trunkVolume;
    }

    public void setTrunkVol(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sedan sedan = (Sedan) o;
        return trunkVolume == sedan.trunkVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trunkVolume);
    }

    @Override
    public String toString() {
        return "Type - sedan:" +
                " horse power=" + getHorsePower() +
                ", model='" + getModel() + '\'' +
                ", mark='" + getMark() + '\'' +
                ", price of car ($)=" + getPrice() +
                ", price (BYN/hour)=" + getPricePerHour() +
                ", fuel consumption (l/100km)=" + getFuelConsumption() +
                ", has child seat -" + isChildSeat() +
                ", on service -" + isOnService() +
                ", trunk volume(l)=" + trunkVolume;
    }
}
