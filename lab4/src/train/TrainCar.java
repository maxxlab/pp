package train;

public class TrainCar {
    private String levelOfComfort;
    private int numberOfPlaces;

    public TrainCar(String levelOfComfort, int numberOfPlaces) {
        this.levelOfComfort = levelOfComfort;
        this.numberOfPlaces = numberOfPlaces;
    }

    public String getLevelOfComfort() {
        return levelOfComfort;
    }

    public void setLevelOfComfort(String levelOfComfort) {
        this.levelOfComfort = levelOfComfort;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }
}
