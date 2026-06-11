package remoteproxy.localserver;

import remoteproxy.remoteserver.Weather;

public class Main {
    public static void main(String[] args) {
        Weather weather = new WeatherProxy();
        System.out.println(weather.getWeather());
    }
}
