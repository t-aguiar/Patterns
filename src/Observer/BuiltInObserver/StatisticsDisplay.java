package Observer.BuiltInObserver;

import java.util.Observer;
import java.util.Observable;

/**
 * Created by Taguiar on 1/27/14.
 */
public class StatisticsDisplay implements Observer, DisplayElement
{
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private int numReadings;
    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData)
    {
        maxTemp = 0.0f;
        minTemp = 200;
        tempSum = 0.0f;

        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg)
    {
        if(o instanceof WeatherData)
        {
            WeatherData data = (WeatherData) o;
            float temp = data.getTemperature();
            tempSum += temp;
            numReadings++;

            if(temp > maxTemp)
                maxTemp = temp;
            if(temp < minTemp)
                minTemp = temp;

            display();
        }
    }
    /*@Override
    public void update(float temp, float humidity, float pressure)
    {
        tempSum += temp;
        numReadings++;

        if(temp > maxTemp)
            maxTemp = temp;
        if(temp < minTemp)
            minTemp = temp;

        display();
    } */

    @Override
    public void display()
    {
        System.out.println("Avg/Min/Max Temperature = " + tempSum/numReadings + "/"
            + minTemp + "/" + maxTemp);
    }


}
