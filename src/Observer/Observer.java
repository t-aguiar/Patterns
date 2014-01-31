package Observer;

/**
 * An observer interface.
 * Any class that wants to listen to a Subject must implement this
 *
 * Java has it already, Observer
 */
public interface Observer
{
    public void update(float temp, float humidity, float pressure);
}
