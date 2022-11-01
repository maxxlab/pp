package action;

import train.Train;

public class TrainCreation {
    Train train;

    public TrainCreation(Train train) {
        this.train = train;
    }

    public int calculatePassengers(){
        return train.getAmountOfPassengers();
    }

    public int calculateBaggage(){
        return train.getAmountOfBaggage();
    }

}
