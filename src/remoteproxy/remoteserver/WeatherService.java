package remoteproxy.remoteserver;

public class WeatherService implements Weather{
    @Override
    public String getWeather() {
        System.out.println("Fetching Weather Data...");
        return "35 Degree Celsius";
    }
}
