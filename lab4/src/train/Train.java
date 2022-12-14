package train;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Train {
    private String trainName;
    private int limitOfBaggage;
    private List<TrainCar> cars;

    public List<TrainCar> getCars() {
        return cars;
    }

    public void setCars(List<TrainCar> cars) {
        this.cars = cars;
    }



    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setLimitOfBaggage(int limitOfBaggage) {
        this.limitOfBaggage = limitOfBaggage;
    }

    public String getTrainName() {
        return trainName;
    }

    public int getLimitOfBaggage() {
        return limitOfBaggage;
    }

    public Train(String trainName, int amountOfBaggage, List<TrainCar> cars) {
        this.trainName = trainName;
        this.limitOfBaggage = amountOfBaggage;
        this.cars = cars;
    }

    public int getAmountOfPassengers(){
        int amount = 0;
        for (TrainCar car : cars){
            amount += car.getNumberOfPlaces();
        }
        return amount;
    }

    public void sortCarsByLevelOfComfort(){
        this.getCars().sort(Comparator.comparingInt(TrainCar::getNumberOfPlaces));
        System.out.println(this.getCars());
    }

    public void findCarByRange(){
        int min, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimal number of passengers: ");
        min = scanner.nextInt();
        System.out.println("Enter the maximal number of passengers: ");
        max = scanner.nextInt();
        for (TrainCar car : cars) {
            if(car.getNumberOfPlaces() >= min && car.getNumberOfPlaces()<=max) {
                System.out.println(car);
            }
        }
    }

    @Override
    public String toString() {
        return "Train\n" +
                "Name: " + trainName +
                "\nlimit of baggage: " + limitOfBaggage +
                "\ncars: " + cars +
                "\ntotal number of places: " + getAmountOfPassengers();
    }
}
