import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> phonebook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        phonebook = new HashMap<>();
    }

       public void enterNumber(String name, String number)
    {
        phonebook.put(name, number);
    }
    
    public String lookupNumber(String name) {
        return phonebook.get(name);
    }

}
