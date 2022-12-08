import java.util.Random;

/**
 * A class for storing information about a subdivision
 * @author Давид
 * @see Subdivision#Subdivision(String)
 * @see Subdivision#Subdivision()
 * @see Subdivision#getName()
 * @see Subdivision#setName(String)
 * @see Subdivision#getID()
 */
public class Subdivision {
    private int ID;
    String name;

    /**
     * Constructor with parameters
     * @param subdivName
     */
    public Subdivision(String subdivName)
    {
        name=subdivName;
        Random rand= new Random();
        ID=rand.nextInt(100000);
    }

    /**
     * Default constructor
     */
    public Subdivision()
    {
        name="";
        Random rand= new Random();
        ID=rand.nextInt(100000);
    }

    /**
     * Function for getting the name of the division
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Function for setting the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function for getting id
     * @return
     */
    public int getID() {
        return ID;
    }

}
