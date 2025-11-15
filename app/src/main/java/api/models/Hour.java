package api.models;

import com.google.gson.annotations.SerializedName;

import api.models.weather.Condition;

public class Hour {
    @SerializedName("time_epoch")
    private long timeEpoch;

    private String time;

    @SerializedName("temp_c")
    private double tempC;

    @SerializedName("temp_f")
    private double tempF;

    @SerializedName("is_day")
    private int isDay;

    private Condition condition;

    @SerializedName("wind_mph")
    private double windMph;

    @SerializedName("wind_kph")
    private double windKph;

    @SerializedName("wind_degree")
    private int windDegree;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("pressure_mb")
    private double pressureMb;

    @SerializedName("pressure_in")
    private double pressureIn;

    @SerializedName("precip_mm")
    private double precipMm;

    @SerializedName("precip_in")
    private double precipIn;

    @SerializedName("snow_cm")
    private double snowCm;

    private int humidity;
    private int cloud;

    @SerializedName("feelslike_c")
    private double feelslikeC;

    @SerializedName("feelslike_f")
    private double feelslikeF;

    @SerializedName("windchill_c")
    private double windchillC;

    @SerializedName("windchill_f")
    private double windchillF;

    @SerializedName("heatindex_c")
    private double heatindexC;

    @SerializedName("heatindex_f")
    private double heatindexF;

    @SerializedName("dewpoint_c")
    private double dewpointC;

    @SerializedName("dewpoint_f")
    private double dewpointF;

    @SerializedName("will_it_rain")
    private int willItRain;

    @SerializedName("chance_of_rain")
    private int chanceOfRain;

    @SerializedName("will_it_snow")
    private int willItSnow;

    @SerializedName("chance_of_snow")
    private int chanceOfSnow;

    @SerializedName("vis_km")
    private double visKm;

    @SerializedName("vis_miles")
    private double visMiles;

    @SerializedName("gust_mph")
    private double gustMph;

    @SerializedName("gust_kph")
    private double gustKph;

    private double uv;

    @SerializedName("short_rad")
    private double shortRad;

    @SerializedName("diff_rad")
    private double diffRad;

    private double dni;
    private double gti;

    // Getters and Setters
    public long getTimeEpoch() {
        return timeEpoch;
    }

    public void setTimeEpoch(long timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public double getSnowCm() {
        return snowCm;
    }

    public void setSnowCm(double snowCm) {
        this.snowCm = snowCm;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    public double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    public double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public int getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    public int getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(int chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public int getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    public int getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(int chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public double getVisKm() {
        return visKm;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    public double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

    public double getGustMph() {
        return gustMph;
    }

    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    public double getGustKph() {
        return gustKph;
    }

    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getShortRad() {
        return shortRad;
    }

    public void setShortRad(double shortRad) {
        this.shortRad = shortRad;
    }

    public double getDiffRad() {
        return diffRad;
    }

    public void setDiffRad(double diffRad) {
        this.diffRad = diffRad;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public double getGti() {
        return gti;
    }

    public void setGti(double gti) {
        this.gti = gti;
    }

}