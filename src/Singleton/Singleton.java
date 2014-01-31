package Singleton;

/**
 * Essentially use any time multiple copies would create a
 * headache in upkeep or program errors
 * ie. lists that multiple portions depend on
 *      resource pools
 *      connections
 */
public class Singleton {
    //A self reference
    private static Singleton instance;

    private Singleton ()
    {
        this.name = "THERE CAN BE ONLY ONE!!!";
    }

    //Derp.
    //forgot that it has to be static to even call it the 1st time
    public static Singleton instance()
    {
        if(instance == null)//if its already created
        {
            return new Singleton();
        }
        return instance;
    }

    //Whatever else you need the class to have/do...
    private String name;
    public String getName()
    {
        return name;
    }
}
