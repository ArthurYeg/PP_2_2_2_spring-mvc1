package web.model;

import org.springframework.stereotype.Component;


public class Car {
    private String series ;
    private String model;
    private int date;

    public Car() {
    }
    public Car(String series, String model, int date) {
        this.series = series;
        this.model = model;
        this.date = date;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

   @Override
    public String toString() {
        return "Car{" +
                "series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                '}';
    }
}