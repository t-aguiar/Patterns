package Observer.BuiltInObserver;

import java.util.Observable;

/**
 * Subject for this example
 */
public class WeatherData extends Observable {
    //Data structure no longer needed to watch observers, handled by API
    //private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){};

    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }

    //TODO: code to grab measurements off web?
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        measurementsChanged();
    }
    //Whatever other methods happen to be needed
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    /*
    * Again, No longer need these because Observable interface handles it all
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
            observer.update(getTemperature(), getHumidity(), getPressure());
        }
    } */
}
