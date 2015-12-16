
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RadarTest
{
    /**
     * Default constructor for test class RadarTest
     */
    public RadarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test()
    {
        // create the radar, set the monster location, and perform the initial scan
        final int ROWS = 100;
        final int COLS = 100;
        Radar radar = new Radar(ROWS, COLS);
        radar.setNoiseFraction(0.10);

        // a frame contains a single component; create the radar component and add it to the frame
        RadarComponent component = new RadarComponent(radar);

        System.out.println("Do you want to specify a location? (y/n) ");
        java.util.Scanner s = new java.util.Scanner(System.in);

        int mRow, mCol;
        if(s.next().toLowerCase().equals("y"))
        {
            System.out.println("Row within "+ROWS+": ");
            mRow=s.nextInt();
            System.out.println("Column within "+COLS+": ");
            mCol=s.nextInt();
        }
        else{
            mRow = (int)(Math.random() * ROWS);
            mCol = (int)(Math.random() * COLS);
            System.out.println("The location of the monster was randomly set to: Row: "+mRow+"; Column: "+mCol);
        }
        radar.setMonsterLocation(mRow, mCol);//sets the monster location
        int iter=100;//number of iterations
        for(int i = 0; i < iter; i++)
        {
            radar.scan();
        }
        //assert that the number of times the monster is at the location is equal to tne number of "scans"
        assertEquals(radar.getAccumulatedDetection(mRow,mCol),iter); 
        //verify that the findMonster function returns the right location
        assertEquals("Row: "+mRow+"; Column: "+mCol, radar.findMonster());
        System.out.println("The monster was found! "+radar.findMonster());
    }
}
