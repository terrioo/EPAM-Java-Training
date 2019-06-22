package by.epam.javatraining.baklaga.maintask02.model.car;

import java.util.Objects;

public class Universal extends Car {

    private int seats;

    public Universal() {
        super();
    }

    public Universal(int horsePower, String model, String mark, int price, int pricePerHour, double fuelConsumption,
                     boolean childSeat, boolean onService, int seats) {
        super(horsePower, model, mark, price, pricePerHour, fuelConsumption, childSeat, onService);
        this.seats = seats;
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
        Universal universal = (Universal) o;
        return seats == universal.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats);
    }

    @Override
    public String toString() {
        return "Type - universal:" +
                " horsePower=" + getHorsePower() +
                ", model='" + getModel() + '\'' +
                ", mark='" + getMark() + '\'' +
                ", price of car ($)=" + getPrice() +
                ", price (BYN/hour)=" + getPricePerHour() +
                ", fuel consumption (l/100km)=" + getFuelConsumption() +
                ", has child seat -" + isChildSeat() +
                ", on service -" + isOnService() +
                ", count of seats=" + seats;
    }
}