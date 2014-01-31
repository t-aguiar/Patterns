package Observer;

/**
 * Created by Taguiar on 1/27/14.
 */
public class StatisticsDisplay implements Observer, DisplayElement
{
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData)
    {
        maxTemp = 0.0f;
        minTemp = 200;
        tempSum = 0.0f;

        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure)
    {
        tempSum += temp;
        numReadings++;

        if(temp > maxTemp)
            maxTemp = temp;
        if(temp < minTemp)
            minTemp = temp;

        display();
    }

    @Override
    public void display()
    {
        System.out.println("Avg/Min/Max Temperature = " + tempSum/numReadings + "/"
            + minTemp + "/" + maxTemp);
    }
}
