package api.models.forecast;

import com.google.gson.annotations.SerializedName;

import api.models.weather.Condition;

public class Day {
    @SerializedName("maxtemp_c")
    private double maxtempC;

    @SerializedName("maxtemp_f")
    private double maxtempF;

    @SerializedName("mintemp_c")
    private double mintempC;

    @SerializedName("mintemp_f")
    private double mintempF;

    @SerializedName("avgtemp_c")
    private double avgtempC;

    @SerializedName("avgtemp_f")
    private double avgtempF;

    @SerializedName("maxwind_mph")
    private double maxwindMph;

    @SerializedName("maxwind_kph")
    private double maxwindKph;

    @SerializedName("totalprecip_mm")
    private double totalprecipMm;

    @SerializedName("totalprecip_in")
    private double totalprecipIn;

    @SerializedName("totalsnow_cm")
    private double totalsnowCm;

    @SerializedName("avgvis_km")
    private double avgvisKm;

    @SerializedName("avgvis_miles")
    private double avgvisMiles;

    @SerializedName("avghumidity")
    private int avghumidity;

    @SerializedName("daily_will_it_rain")
    private int dailyWillItRain;

    @SerializedName("daily_chance_of_rain")
    private int dailyChanceOfRain;

    @SerializedName("daily_will_it_snow")
    private int dailyWillItSnow;

    @SerializedName("daily_chance_of_snow")
    private int dailyChanceOfSnow;

    private Condition condition;
    private double uv;

    // Getters and Setters
    public double getMaxtempC() {
        return maxtempC;
    }

    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    public double getMaxtempF() {
        return maxtempF;
    }

    public void setMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
    }

    public double getMintempC() {
        return mintempC;
    }

    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    public double getMintempF() {
        return mintempF;
    }

    public void setMintempF(double mintempF) {
        this.mintempF = mintempF;
    }

    public double getAvgtempC() {
        return avgtempC;
    }

    public void setAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
    }

    public double getAvgtempF() {
        return avgtempF;
    }

    public void setAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
    }

    public double getMaxwindMph() {
        return maxwindMph;
    }

    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    public double getMaxwindKph() {
        return maxwindKph;
    }

    public void setMaxwindKph(double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    public double getTotalprecipIn() {
        return totalprecipIn;
    }

    public void setTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    public double getTotalsnowCm() {
        return totalsnowCm;
    }

    public void setTotalsnowCm(double totalsnowCm) {
        this.totalsnowCm = totalsnowCm;
    }

    public double getAvgvisKm() {
        return avgvisKm;
    }

    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    public double getAvgvisMiles() {
        return avgvisMiles;
    }

    public void setAvgvisMiles(double avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    public int getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
    }

    public int getDailyWillItRain() {
        return dailyWillItRain;
    }

    public void setDailyWillItRain(int dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    public int getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    public void setDailyChanceOfRain(int dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public int getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    public void setDailyWillItSnow(int dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    public int getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    public void setDailyChanceOfSnow(int dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

}