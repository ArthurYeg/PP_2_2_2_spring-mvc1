package web.model;

public class Car {
    private String series ;
    private String model;
    private int date;

    private static String header = "Series/" + ' ' + "Model/" + ' ' + "Date of production";

    public Car(String series, String model, int date) {
        this.series = series;
        this.model = model;
        this.date = date;
    }

    public Car() {
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

    public String toStringFormatted() {
        return series + "/ " + model + "/ " + +date;
    }

    public String header() {
        return header;
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