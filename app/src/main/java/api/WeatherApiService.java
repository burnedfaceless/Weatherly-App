package api;

import api.models.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Retrofit API Interface for Weather API
 */
public interface WeatherApiService {
    
    /**
     * Get weather forecast for a location
     * 
     * @param apiKey Your API key from weatherapi.com
     * @param query Location query (city name, zip code, lat/lon, etc.)
     * @param days Number of days of forecast (1-10)
     * @param aqi Include air quality data (yes/no)
     * @param alerts Include weather alerts (yes/no)
     * @return Call object with WeatherResponse
     */
    @GET("v1/forecast.json")
    Call<WeatherResponse> getWeatherForecast(
            @Query("key") String apiKey,
            @Query("q") String query,
            @Query("days") int days,
            @Query("aqi") String aqi,
            @Query("alerts") String alerts
    );
}
