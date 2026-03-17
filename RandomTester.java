import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private int x;
    private String generator; 
 
    
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void  printOneRandom() {
        System.out.println("One random :" + generator.nextInt(1000));
    }
    
    public void printMultiRandom(int howMany) {
        System.out.println("Multi Random (" + howMany + "):");
        int n = 0;
        while (howMany > n) {
        System.out.println(generator.nextInt(1000));
        n++;
       }
    }
    
    public int throwDice() {
        int dice =generator.nextInt(6);
        return dice+1;
    }
    
    public String getResponse() {
        ArrayList<String> responseList = new ArrayList();
        responseList.add("yes");
        responseList.add("no");
        responseList.add("maybe");
        
        int index = generator.nextInt(responseList.size(3));
        
        return responseList.get(index);
    }
}