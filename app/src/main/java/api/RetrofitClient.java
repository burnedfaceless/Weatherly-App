package api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;


public class RetrofitClient {
    
    private static final String BASE_URL = "http://api.weatherapi.com/";
    private static RetrofitClient instance;
    private Retrofit retrofit;
    private WeatherApiService weatherApiService;
    
    private RetrofitClient() {
        // Create logging interceptor for debugging
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        
        // Create OkHttp client with interceptors and timeouts
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();
        
        // Create Retrofit instance
        retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        
        // Create API service
        weatherApiService = retrofit.create(WeatherApiService.class);
    }
    
    /**
     * Get singleton instance
     */
    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }
    
    /**
     * Get Weather API Service
     */
    public WeatherApiService getWeatherApiService() {
        return weatherApiService;
    }
}
