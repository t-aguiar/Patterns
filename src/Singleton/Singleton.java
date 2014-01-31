package Singleton;

/**
 * Essentially use any time multiple copies would create a
 * headache in upkeep or program errors
 * ie. lists that multiple portions depend on
 *      resource pools
 *      connections
 *
 * Multithreading can cause issues, one soln synchronized to static method
 * High overhead however, only needed on the first path.  Bad idea if class
 * will get alot of traffic.
 *
 * Another solution is to create an instance when program loads class.
 * Little bit of overhead but likely to be far less than synchronizing
 *
 * Option 3: synchronize only the actual instantiation
 */
public class Singleton {
    //A self reference
    //in Option3 add 'volatile' to instance declaration
    private static Singleton instance = new Singleton();

    private Singleton ()
    {
        this.name = "THERE CAN BE ONLY ONE!!!";
    }

    //Derp.
    //forgot that it has to be static to even call it the 1st time
    public static Singleton instance()
    {   /*Removed for safer multithreading
        if(instance == null)//if its already created
        {
            synchronized (Singleton.class)
            {
                if(instance == null)
                    instance = new Singleton();
            }
        }*/
        return instance;
    }

    //Whatever else you need the class to have/do...
    private String name;
    public String getName()
    {
        return name;
    }
}
