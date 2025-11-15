package api.models;

import api.models.forecast.Forecast;
import api.models.weather.Current;

public class WeatherResponse {

    private Location location;
    private Current current;
    private Forecast forecast;

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

}