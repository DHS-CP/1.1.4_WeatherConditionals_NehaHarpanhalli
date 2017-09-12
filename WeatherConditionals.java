package org.pltw.examples.weather;

/**
 * Created by wdumas on 3/3/16.
 */
public class WeatherConditionals {

    public static String getWeatherAdvice(int temperature, String description){
        description = description.toLowerCase();
        if((temperature >= 65) && (description.equals("cloudy"))) {
            return("You're in San Jose.");
        }
        if(description.equals("fair")) {
            return("You're in Santa Fe.");
        }
        if(description.equals("hurricane")) {
            return("You're in Miami.");
        }
        if((temperature > 70) && (description.indexOf("partly cloudy") != -1)) {
            return("You're in Denver.");
        }
        if(description.equals("sunny")) {
            return("You're in Yosemite Valley.");
        }
        return("Bring an Umbrella!");
    }
}
