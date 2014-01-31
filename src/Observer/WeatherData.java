package Observer;

import java.util.ArrayList;

/**
 * Subject for this example
 */
public class WeatherData implements Subject
{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList();
    }

    @Override //Just add to list any additional observers
    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    @Override //Remove observer by index
    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if(i>=0)
        {
            observers.remove(i);
        }
    }

    @Override //Notify each observer in its list
    public void notifyObservers()
    {
        for(int i=0; i<observers.size(); i++)
        {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    //TODO: code to grab measurements off web?
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //Whatever other methods happen to be needed
}
