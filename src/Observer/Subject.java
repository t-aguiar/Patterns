package Observer;

/**
 * A Subject interface
 * Any class that wants others to be able to be notified of changes
 * must implement this.
 *
 * This design allows for loose coupling because the
 * subject doesn't care about the observers beyond that
 * they implement the appropriate interface.
 * Add or remove them and the subject doesn't care.
 *
 * Java has it already Observable
 */
public interface Subject
{
    //Add a object to the notify list
    public void registerObserver(Observer o);

    //Remove an object from notify list
    public void removeObserver(Observer o);

    //Notify all observers
    public void notifyObservers();
}
