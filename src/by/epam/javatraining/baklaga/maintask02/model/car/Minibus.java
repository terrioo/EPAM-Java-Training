package by.epam.javatraining.baklaga.maintask02.model.car;

import java.util.Objects;

public class Minibus extends Car {
    private int trunkVolume;
    private int seats;

    public Minibus() {
        super();
    }

    public Minibus(int horsePower, String model, String mark, int price, int pricePerHour, double fuelConsumption,
                   boolean childSeat, boolean onService, int trunkVolume, int seats) {
        super(horsePower, model, mark, price, pricePerHour, fuelConsumption, childSeat, onService);
        this.seats = seats;
        this.trunkVolume = trunkVolume;
    }

    public int getTrunkVol() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Minibus that = (Minibus) o;
        return trunkVolume == that.trunkVolume &&
                seats == that.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trunkVolume, seats);
    }

    @Override
    public String toString() {
        return "Type - minibus:" +
                " horse power=" + getHorsePower() +
                ", model='" + getModel() + '\'' +
                ", mark='" + getMark() + '\'' +
                ", price of car ($)=" + getPrice() +
                ", price (BYN/hour)=" + getPricePerHour() +
                ", fuel consumption (l/100km)=" + getFuelConsumption() +
                ", has child seat -" + isChildSeat() +
                ", on service -" + isOnService() +
                ", trunk volume(l)=" + trunkVolume +
                ", count of seats=" + seats;
    }
}

