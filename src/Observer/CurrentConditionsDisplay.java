package Observer;

/**
 * Created by Taguiar on 1/27/14.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    //Personal variables and a place holder for its Subject
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //Upon creation registers to the subject, subject must be created first
    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
