package Observer.BuiltInObserver;

import java.util.Observer;

import java.util.Observable;

/**
 * Created by Taguiar on 1/27/14.
 */
public class ForecastDisplay implements Observer, DisplayElement
{
    private float currentPressure;
    private float lastPressure;
    private Observable weatherData;

    public ForecastDisplay(Observable weatherData)
    {
        currentPressure = 29.92f;

        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display()
    {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    /*@Override //Note that each observer gets all the data from the subject, uses what it needs
    public void update(float temp, float humidity, float pressure)
    {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    } */

    @Override
    public void update(Observable o, Object arg)
    {
        if(o instanceof WeatherData)
        {
            WeatherData data = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = data.getPressure();

            display();
        }
    }
}
