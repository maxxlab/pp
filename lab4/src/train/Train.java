package train;

import java.util.List;

public class Train {
    private String trainName;
    private int amountOfPassengers;
    private int amountOfBaggage;
    private int numberOfCars;
    private List<TrainCar> cars;

    public List<TrainCar> getCars() {
        return cars;
    }

    public void setCars(List<TrainCar> cars) {
        this.cars = cars;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public void setAmountOfBaggage(int amountOfBaggage) {
        this.amountOfBaggage = amountOfBaggage;
    }

    public String getTrainName() {
        return trainName;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public int getAmountOfBaggage() {
        return amountOfBaggage;
    }

    public Train(String trainName, int amountOfPassengers, int amountOfBaggage, int numberOfCars, List<TrainCar> cars) {
        this.trainName = trainName;
        this.amountOfPassengers = amountOfPassengers;
        this.amountOfBaggage = amountOfBaggage;
        this.numberOfCars = numberOfCars;
        this.cars = cars;
    }
}
