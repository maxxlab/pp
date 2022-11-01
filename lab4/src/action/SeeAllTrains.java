package action;

import train.Train;
import train.TrainCar;

import java.util.List;

public class SeeAllTrains {
    List<Train> trains;

    public SeeAllTrains(List<Train> trains) {
        this.trains = trains;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public void seeTrainCars(Train train){
        System.out.println(train.getCars());
    }

    public void sortTrainCars(Train train){

    }

    public void seePrices(TrainCar car) {

    }


}
