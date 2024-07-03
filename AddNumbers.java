
/**
 * Write a description of class AddNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AddNumbers
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class AddNumbers
     */
    public AddNumbers()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static void main(String[] args){
      int a = 5;
      int b  = 7;
      int sum;
      sum  = a+b;
      System.out.println(sum);
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
}
