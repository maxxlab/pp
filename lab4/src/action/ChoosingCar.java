package action;

import train.Train;
import train.TrainCar;
import userMenu.Menu;

public class ChoosingCar {
    TrainCar car;
    boolean discount;

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public ChoosingCar(TrainCar car) {
        this.car = car;
    }

    public TrainCar getCar() {
        return car;
    }

    public TrainCar findByRangeOfPassengers(Train train){
        return car;
    }

    public void choosePlaces(){

    }
}
