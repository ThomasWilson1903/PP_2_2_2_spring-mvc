package models;

public class Car {
    private String nameCar;
    private String model;
    private int series;

    public Car(String nameCar, String model, int series) {
        this.nameCar = nameCar;
        this.model = model;
        this.series = series;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
