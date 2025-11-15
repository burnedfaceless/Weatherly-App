package api.models.forecast;

import com.google.gson.annotations.SerializedName;

public class Astro {
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;

    @SerializedName("moon_phase")
    private String moonPhase;

    @SerializedName("moon_illumination")
    private int moonIllumination;

    @SerializedName("is_moon_up")
    private int isMoonUp;

    @SerializedName("is_sun_up")
    private int isSunUp;

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public int getMoonIllumination() {
        return moonIllumination;
    }

    public void setMoonIllumination(int moonIllumination) {
        this.moonIllumination = moonIllumination;
    }

    public int getIsMoonUp() {
        return isMoonUp;
    }

    public void setIsMoonUp(int isMoonUp) {
        this.isMoonUp = isMoonUp;
    }

    public int getIsSunUp() {
        return isSunUp;
    }

    public void setIsSunUp(int isSunUp) {
        this.isSunUp = isSunUp;
    }

}