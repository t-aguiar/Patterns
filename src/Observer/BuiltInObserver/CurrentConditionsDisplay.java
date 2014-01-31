package Observer.BuiltInObserver;

import com.sun.java.swing.plaf.windows.resources.windows_de;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Taguiar on 1/27/14.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    //Personal variables and a place holder for its Subject
    private float temperature;
    private float humidity;
    private Observable weatherData;

    //Upon creation registers to the subject, subject must be created first
    //With java api still need to contain a reference to what is being observed
    public CurrentConditionsDisplay(Observable weatherData)
    {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }

    /* Changed for the API
    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }*/

    @Override
    public void update(Observable o, Object arg)
    {
        if(o instanceof WeatherData)
        {
            WeatherData wData = (WeatherData) o;//Cast observable to weatherdata
            this.temperature = wData.getTemperature();
            this.humidity = wData.getHumidity();
            display();
        }
    }
}
